from graphviz import Digraph


class listaCircularCanciones:

    def __init__(self):
        self.first = None
        self.last = None

    def insertar(self, element):
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

    # def search(self, nombre, path):
    #     aux = self.first
    #     if (aux != None):
    #         while True:
    #             if (aux.nombre == nombre and aux.pasword == pasword):
    #                 print ('Encontre algo: '+aux.nombre+' '+aux.pasword)
    #                 return aux
    #             aux = aux.next
    #             if (aux == self.first):
    #                 print ('El Usuario No existe')
    #                 return None
    #     print ('El Usuario No Existe')
    #     return None
    #
    # def delete(self, element):
    #
    #     if element == self.first:
    #         self.first = self.first.next
    #         self.first.prev = self.last
    #         self.last.next = self.first
    #     elif element == self.last:
    #         self.last = self.last.prev
    #         self.last.next = self.first
    #         self.first.prev = self.last
    #     else:
    #         aux = self.first
    #         while (aux.next != self.first):
    #             if (aux == element):
    #                 aux.next.prev = aux.prev
    #                 aux.prev.next = aux.next
    #             aux = aux.next

    # def graficar(self):
    #     g = Digraph('G', filename='graficaLista.gv')
    #     g.body.append('rankdir=LR')
    #     g.attr('node', shape='box', color='blue')
    #     aux = self.first
    #     if aux == None:
    #         print "Lista vacia"
    #         g.edge(str('LISTA VACIA'))
    #     else:
    #         print str(aux.nombre + " " + aux.pasword)
    #         while True:
    #             g.edge(str(aux.nombre), str(aux.next.nombre))
    #             g.body.append('[dir=both]')
    #             aux = aux.next
    #             if (aux.next == self.first):
    #                 break
    #             print str(aux.nombre + " " + aux.pasword)
    #     g.format = 'png'
    #     g.view()

    text = ""
    def recorrerLista(self):
        self.text +="style=filled; \n color=lightgrey; \n node [style=filled,color=white]; \n"
        aux = self.first
        if  (aux == None):
            self.text +="No Tiene Canciones Este Album"
        else:
            while True:
                self.text += str(aux.nombre) + "->" + str(aux.next.nombre) + "[dir = both constraint= false] \n"
                aux = aux.next
                if (aux == self.first):
                    self.text+="label = \"Lista de Canciones\"; \n"
                    return self.text




