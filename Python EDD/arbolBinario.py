from NodoBinario import nBinary
from graphviz import Digraph
from listaCircularCanciones import listaCircularCanciones


class aBinary:
    def __init__(self):
        self.root = None

    def insert(self, element):
        if self.root == None:
            self.root = element
        else:
            aux = self.root
            father = None
            while aux != None:
                father = aux
                if (element.id) >= (aux.id):
                    aux = aux.right
                else:
                    aux = aux.left
            if (element.id) >= (father.id):
                father.right = element
            else:
                father.left = element

    def search(self, date, element):
        if (element != None):
            if date == element.id:
                return element
            else:
                if (date) < (element.id):
                    return self.search(date, element.left)
                else:
                    return self.search(date, element.right)

    def insertListaCircular(self, node, nodeCancion):
        if (node.acceso == None):
            lista = listaCircularCanciones()
            node.acceso = lista
            lista.insertar(nodeCancion)
        else:
            aux = node.acceso
            aux.insertar(nodeCancion)

    text = ""

    def Recorrer(self, node):
        if node != None:
            self.text += '"nodo' + str(node) + '"[ label = "<C0>|' + str(node) + '|<C1>"]; \n'
        if node.left:
            self.text += '"nodo' + str(node) + "\":C0->" + '"nodo' + str(
                node.left) + '" [arrowhead=invodot color=red]' + "\n"
            self.Recorrer(node.left)
        if node.right:
            self.text += '"nodo' + str(node) + "\":C1->" + '"nodo' + str(
                node.right) + '"[arrowhead=invodot color=red]' + "\n"
            self.Recorrer(node.right)

    txt = ''
    def todosNodos(self, node):
        if(node != None):
            cancion = node.acceso
            if(cancion != None):
                self.txt+='*Album: *'+str(node)
                self.txt += cancion.Canciones()
            self.todosNodos(node.left)
            self.todosNodos(node.right)

    albums = ''
    def todosAlbums(self, node):
        if(node != None):
            lCanciones = node.acceso
            self.albums += '*Album*' + str(node)
            if(lCanciones!= None):
               self.albums += lCanciones.Canciones()
            self.todosAlbums(node.left)
            self.todosAlbums(node.right)

    def regresarCadena(self):
        t = self.albums
        self.albums = ''
        return t

    def retornarCanciones(self):
        t = self.txt
        self.txt = ''
        return t

    def preOrder(self, elemento):
        if (elemento != None):
            print (elemento)
            self.preOrder(elemento.left)
            self.preOrder(elemento.right)

    def postOrder(self, elemento):
        if (elemento != None):
            self.postOrder(elemento.left)
            self.postOrder(elemento.right)
            print(elemento)

    def inOrder(self, elemento):
        if (elemento != None):
            self.inOrder(elemento.left)

            print(elemento)
            self.inOrder(elemento.right)

    def getRoot(self):
        if (self.root != None):
            return self.root

    def graficarBinario(self, nombreArtista):
        g = Digraph('g', filename='BBTree.gv')
        g.body.append('rankdir=UD')
        g.attr('node', shape='record', color='blue')
        aux = self.root
        if aux == None:
            print "Arbol Vacio"
            g.edge(str('Arbol Vacio'))
        else:
            aux = self.getRoot()
            self.Recorrer(aux)
            g.body.append(self.text)
            g.body.append('label = "Arbol Binario de Albums del Artista: ' + str(nombreArtista) + '"')
        g.format = 'png'
        g.render('test-output/ABB/BBTree.gv', view=True)


    def recorrerListaCanciones(self,lista):
        lista.graficarListaCanciones()
