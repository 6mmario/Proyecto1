from NodoCola import nodeCola
from graphviz import Digraph

class colaCircular:
    def __init__(self):
        self.front = None
        self.final = None

    def insert(self,element):
        if self.front == None:
            self.front = element
            self.final = element
        else:
            self.final.next = element
            element.prev = self.final
            self.final = element
            self.final.next = self.front
            self.front.prev = self.final

    def graficar(self):
        g = Digraph('G', filename='graficaColaCircular.gv')
        g.body.append('rankdir=LR')
        g.attr('node', shape='box', color='blue')
        aux = self.front
        if aux == None:
            print "Cola Vacia vacia"
            g.edge(str('Cola esta vacia'))
        else:
            print str(aux.nombre)
            while True:
                g.edge(str(aux.nombre), str(aux.next.nombre))
                aux = aux.next
                if (aux == self.front):
                    break
                print str(aux.nombre)
        g.format = 'png'
        g.view()

    text = ""
    def recorrer(self):
        self.text = ""
        self.text += '\tstyle=filled; \n\tcolor=lightgrey; \n\tnode [style=filled,color=white]; \n'
        aux = self.front
        if (aux == None):
            self.text += 'Cola de Canciones Vacia'
            return self.text
        else:
            while True:
                self.text += str(aux.nombre) + '->'+str(aux.next.nombre) +' [arrowhead=odot color=green]'
                aux = aux.next
                if(aux == self.front):
                    return self.text
