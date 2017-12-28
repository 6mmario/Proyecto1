# coding=utf-8
import bisect
from arbolBinario import aBinary


class _BTreeNode(object):
    def __init__(self, values=None, children=None, accesos=None):
        self.parent = None
        self.values = values or []
        self.children = children
        self.accesos = accesos
        if self.children:
            for i in self.children:
                i.parent = self

    text = ''
    def __str__(self):
        self.text += 'Node(%r)' % (self.values)
        return 'Node(%r)' % (self.values)

    def pretty_print(self, tab=''):
        print('%s%s' % (tab, self))
        if self.children:
            for i in self.children:
                i.pretty_print(tab + ' s ')


    def graficar(self, tab=''):
        self.text += ('%s%s' % (tab ,self))
        if self.children:
            for i in self.children:
                i.graficar(tab + ' s ')
        return self.text




    def check_valid(self, tree):
        innerNode = self.children is not None
        rootNode = self.parent is None

        assert (self.values is not None)

        # un nodo interno, excepto la raíz, tiene al menos min_values
        if not rootNode and innerNode:
            assert (tree.min_values <= len(self.values))

        # un nodo no puede tener más de max_values
        assert (len(self.values) <= tree.max_values)

        # La raíz tiene al menos dos hijos si no es un nodo hoja.
        if rootNode and innerNode:
            assert (len(self.children) >= 2)

        # Un nodo no hoja con k hijos contiene claves k-1.
        if innerNode:
            assert ((len(self.values) + 1) == len(self.children))

        # check that values are sorted
        prev = None
        for i in self.values:
            if prev is not None:
                assert (i > prev)
            prev = i

        if self.children:
            for i in self.children:
                assert (i.parent is self)
                i.check_valid(tree)

    def search(self, val):
        i = bisect.bisect_left(self.values, val)
        if (i != len(self.values) and not val < self.values[i]):
            # se encontró un valor
            assert (self.values[i] == val)
            # return (True,self.values[i], self, i)
            return self.values[i], self, i

        if self.children is not None:
            assert (len(self.children) >= i and self.children[i])
            # buscar recursivamente en el nodo secundario apropiado
            return self.children[i].search(val)
        else:
            # return (False, self, i)
            return False, self, i

    def _split_node(self, tree, val=None, slot=None, childNodes=None):
        assert (val is None or (slot is not None))

        midList = [] if val is None else [val]
        if slot is None:
            slot = 0

        # obtener la mediana de self.values ​​y val
        splitValues = self.values[0:slot] + midList + self.values[slot:]
        medianIdx = len(splitValues) // 2

        lv = splitValues[0:medianIdx]
        medianVal = splitValues[medianIdx]
        rv = splitValues[medianIdx + 1:]

        innerNode = self.children is not None

        if innerNode:
            if childNodes is not None:
                splitChildren = (self.children[0:slot] + list(childNodes) + self.children[slot + 1:])
            else:
                splitChildren = self.children
            lc = splitChildren[0:len(lv) + 1]
            rc = splitChildren[len(lv) + 1:]
        else:
            lc = None
            rc = None

        leftNode = _BTreeNode(lv, lc)
        rightNode = _BTreeNode(rv, rc)

        if self.parent:
            self.parent.add(tree, medianVal, None, (leftNode, rightNode))
        else:
            # create new root and increment the tree depth
            newRoot = _BTreeNode([medianVal], [leftNode, rightNode])
            leftNode.parent = newRoot
            rightNode.parent = newRoot
            tree.root = newRoot
            tree.height += 1
            tree.size += 1

    def add(self, tree, val, slot=None, childNodes=None):
        # todas las inserciones deben comenzar en un nodo hoja,
        # a menos que llamemos de manera recursiva en el padre
        # como resultado de la división de nodos
        # cuando estamos agregando el valor mediano al padre

        assert (self.children is None or childNodes)

        # si este es un nodo interno si no es una hoja o la raíz
        # entonces self.children no es None, entonces también
        # esta función debe haber sido llamada recursivamente
        # con childNodes no None, val not None y
        # len (childNodes) == 2

        innerNode = self.children is not None
        if innerNode:
            assert (childNodes and len(childNodes) == 2)
        else:
            assert (childNodes is None)
            # si aún no se encuentra, encuentre la posición de inserción entre
            # los valores del nodo actual
        if slot is None:
            slot = bisect.bisect_left(self.values, val)

        # podemos hacer la inserción a los valores de nodo actuales?
        if len(self.values) < tree.max_values:
            self.values.insert(slot, val)
            tree.size += 1
            if childNodes:
                # actualizar la referencia principal en los nodos que estamos a punto de agregar
                for i in childNodes:
                    i.parent = self
                self.children[slot:slot + 1] = childNodes

            # estamos hechos
            return True

        # parece que el nodo actual está lleno, tenemos que dividirlo
        self._split_node(tree, val, slot, childNodes)
        return True

    def min_value(self, slot=0):
        if self.children:
            return self.children[slot].min_value()
        return self.values[0], self, 0

    def max_value(self, slot=None):
        if slot is None:
            slot = len(self.values) - 1
        if self.children:
            return self.children[slot + 1].max_value()
        return self.values[-1], self, len(self.values) - 1

    def delete(self, tree, val, slot=None):

        innerNode = self.children is not None
        if slot is None:
            assert (slot is not None)
            slot = bisect.bisect_left(self.values, val)

        assert (slot != len(self.values) and self.values[slot] == val)

        if not innerNode:
            # realizar la eliminación de una hoja
            del self.values[slot]
            tree.size -= 1
            if len(self.values) < tree.min_values:
                # underflow ocurrido en el nodo hoja
                # árbol reequilibrio comenzando con este nodo
                self._rebalance(tree)
        else:
            # encontrar el valor mínimo en el subárbol derecho
            # y úselo como el valor del separador para reemplazar val
            newSep, node, idx = self.min_value(slot + 1)
            self.values[slot] = newSep
            del node.values[idx]
            tree.size -= 1
            if len(node.values) < tree.min_values:
                node._rebalance(tree)

    def _rebalance(self, tree):
        lsibling, rsibling, idx = self.get_siblings()

        # solo la raíz no tiene hermanos
        assert (rsibling or lsibling or self.parent is None)

        if self.parent is None:
            # esto es un no-op para el nodo raíz
            return

        innerNode = self.children is not None
        if innerNode:
            assert (rsibling is None or rsibling.children is not None)
            assert (lsibling is None or lsibling.children is not None)
        else:
            assert (rsibling is None or rsibling.children is None)
            assert (lsibling is None or lsibling.children is None)

        if not innerNode:
            if rsibling and len(rsibling.values) > tree.min_values:
                sepIdx = idx
                sepVal = self.parent.values[sepIdx]
                # borrow node de rsibling para realizar un giro a la izquierda
                self.parent.values[sepIdx] = rsibling.values[0]
                del rsibling.values[0]
                self.values.append(sepVal)
                return
            elif lsibling and len(lsibling.values) > tree.min_values:
                sepIdx = idx - 1
                sepVal = self.parent.values[sepIdx]
                # borrow node de lsibling para realizar un giro a la derecha
                self.parent.values[sepIdx] = lsibling.values[-1]
                del lsibling.values[-1]
                self.values.insert(0, sepVal)
                return

        # tenemos que fusionar 2 nodos
        if lsibling is not None:
            sepIdx = idx - 1
            ln = lsibling
            rn = self
        elif rsibling is not None:
            sepIdx = idx
            ln = self
            rn = rsibling
        else:
            assert (False)

        sepVal = self.parent.values[sepIdx]

        ln.values.append(sepVal)
        ln.values.extend(rn.values)
        del rn.values[:]
        del self.parent.values[sepIdx]
        assert (self.parent.children[sepIdx + 1] is rn)
        del self.parent.children[sepIdx + 1]
        if rn.children:
            ln.children.extend(rn.children)
            for i in rn.children:
                i.parent = ln

        if len(ln.values) > tree.max_values:
            # tenemos que dividir el nodo recién formado
            # esta situación puede surgir solo cuando se fusionan los nodos internos
            assert (innerNode)
            ln._split_node(tree)

        if len(self.parent.values) < tree.min_values:
            # reequilibrar al padre
            self.parent._rebalance(tree)

        if self.parent.parent is None and not self.parent.values:
            tree.root = ln
            tree.root.parent = None

    def get_siblings(self):
        if not self.parent:
            # la raíz no tiene hermanos
            return (None, None, 0)

        assert (self.parent.children)

        lsibling = None
        rsibling = None
        idx = 0

        for i, j in enumerate(self.parent.children):
            if j is self:
                if i != 0:
                    lsibling = self.parent.children[i - 1]
                if (i + 1) < len(self.parent.children):
                    rsibling = self.parent.children[i + 1]
                idx = i
                break

        return (lsibling, rsibling, idx)


class BTree(object):
    def __init__(self, order):
        if order <= 2:
            raise ValueError("B-tree order must be at least 3")
        self.root = _BTreeNode()
        self.order = order
        self.max_values = order - 1
        self.min_values = self.max_values // 2
        self.height = 1
        self.size = 0

    def __str__(self):
        return 'height: %d items: %d m: %d root: %x' % (
            self.height, self.size,
            self.max_values + 1,
            id(self.root))

    def add(self, val):
        # encontrar el nodo de hoja donde se debe agregar el valor
        found, node, slot = self.root.search(val)
        if found:
            # el valor ya existe, no puede agregarlo dos veces
            return False
        return node.add(self, val, slot, None)

    def insertBinario(self, elementoB, elementoBinario):
        aux = tree.search(elementoB)
        print str(aux)
        if (aux != None):
            if (aux.accesos == None):
                binario = aBinary()
                aux.accesos = binario
                binario.insert(elementoBinario)
            else:
                aux.accesos.insert(elementoBinario)

    def delete(self, val):
        # encontrar el valor y su
        found, node, slot = self.root.search(val)
        if not found:
            # el valor no existe, no puede eliminarlo
            return False
        return node.delete(self, val, slot)

    def search(self, val):
        return self.root.search(val)[0]

    def min(self):
        return self.root.min_value()[0]

    def max(self):
        return self.root.max_value()[0]


if __name__ == '__main__':
    tree = BTree(5)

    tree.add('moto')
    tree.add('mota')
    tree.add('pedo')
    tree.add('casa')
    tree.add('dedo')
    tree.add('pato')
    tree.add('bano')
    tree.add('tapa')
    tree.add('open')
    tree.add('logo')
    tree.add('rosa')
    tree.add('caja')
    tree.add('pesa')
    tree.add('flor')
    tree.add('fast')
    tree.add('jose')
    tree.add('obed')
    tree.add('lobo')
    tree.add('loro')
    tree.add('lodo')
    tree.root.pretty_print()
    aux = tree.search('loro')
    print str(aux)
    print str(tree.root.graficar())


