from NodoCircular import nodeCircular
from ColaCircular import colaCircular
from graphviz import Digraph


class listaCircular:
    def __init__(self):
        self.first = None
        self.last = None

    def insert(self, element):
        if self.first == None:
            self.first = element
            self.last = element
            self.last.next = self.first
            self.first.prev = self.last
        else:
            self.last.next = element
            element.prev = self.last
            self.last = element
            self.last.next = self.first
            self.first.prev = self.last

    def search(self, nombre, pasword):
        aux = self.first
        if (aux != None):
            while True:
                if (aux.nombre == nombre and aux.pasword == pasword):
                    print ('Encontre algo: '+aux.nombre+' '+aux.pasword)
                    return aux
                aux = aux.next
                if (aux == self.first):
                    print ('El Usuario No existe')
                    return None
        print ('El Usuario No Existe')
        return None

    def insertColaCanciones(self,elementoCircular, elementoCola):
        if (elementoCircular != None):
            if (elementoCircular.accesoCola == None):
                cola = colaCircular()
                elementoCircular.accesoCola = cola
                cola.insert(elementoCola)

            else:
                aux = elementoCircular.accesoCola
                aux.insert(elementoCola)

    def delete(self, element):

        if element == self.first:
            self.first = self.first.next
            self.first.prev = self.last
            self.last.next = self.first
        elif element == self.last:
            self.last = self.last.prev
            self.last.next = self.first
            self.first.prev = self.last
        else:
            aux = self.first
            while (aux.next != self.first):
                if (aux == element):
                    aux.next.prev = aux.prev
                    aux.prev.next = aux.next
                aux = aux.next

    text = ""
    def graficar(self):
        self.text = ""
        g = Digraph('G', filename='graficaListaUsuarios.gv')
        g.body.append('rankdir=LR')
        g.attr('node', shape='box', color='blue')
        g.attr('node', fontname='Marvel', fontsize='14')
        aux = self.first
        if aux == None:
            print "Lista vacia"
            g.edge(str('LISTA VACIA'))
        else:
            while True:
                g.edge(str(aux.nombre), str(aux.next.nombre))
                g.body.append('[dir=both arrowhead=halfopen color=darkgreen]')
                if (aux.accesoCola != None):
                    temp = aux.accesoCola
                    self.text += str(aux.nombre)+'->'+str(temp.front.nombre) + '[arrowhead=inv color=goldenrod]'
                    self.text +='\n subgraph cluster_'+str(aux.nombre)+'{ \n'
                    self.text += temp.recorrer()
                    self.text += '\nlabel = "Cola Circular de Canciones de '+str(aux.nombre)+'"; \n } \n'
                    g.body.append(self.text)
                    self.text = ""
                aux = aux.next
                if (aux == self.last.next):
                    break
        g.body.append('label = "Lista Doblemente Enlazada de Usuarios"; \n')
        g.format = 'png'
        g.view()
