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
                    return aux
                aux = aux.next
                if (aux == self.first):
                    return None
        return None


    def eliminarCanciones(self,parametro1,parametro2, parametro3, parametro4, parametro5, parametro6):
        aux = self.first
        if(aux !=None):
            while True:
                cola = aux.accesoCola
                if(cola != None):
                    cola.buscarCanciones(parametro1,parametro2, parametro3, parametro4, parametro5, parametro6)
                aux = aux.next
                if(aux.next == self.first):
                    break

    def insertColaCanciones(self,elementoCircular, elementoCola):
        if (elementoCircular != None):
            if (elementoCircular.accesoCola == None):
                cola = colaCircular()
                elementoCircular.accesoCola = cola
                cola.insertCola(elementoCola)
            else:
                aux = elementoCircular.accesoCola
                aux.insertCola(elementoCola)


    def recorrerColaCancion(self,elementCola):
        return elementCola.cadenaCanciones()


    def delete(self, element):
        if element == self.last == self.first:
            self.last = None
            self.first = None
        elif element == self.first:
            self.first = self.first.next
            self.first.prev = self.last
            self.last.next = self.first
        elif element == self.last:
            self.last = self.last.prev
            self.last.next = self.first
            self.first.prev = self.last

        else:
            aux = self.first
            while True:
                if (aux == element):
                    aux.prev.next = aux.next
                    aux.next.prev = aux.prev
                aux = aux.next
                if(aux.next == self.first):
                    break

    text = ""
    def graficar(self):
        self.text = ""
        g = Digraph('G', filename='graficaListaUsuarios.gv')
        g.body.append('rankdir=LR')
        g.attr('node', shape='box', color='blue')
        aux = self.first
        if aux == None:
            print "Lista vacia"
            g.body.append('"Lista Vacia"')
        else:
            while True:
                g.body.append('"'+str(aux.nombre)+str(aux.pasword)+'"'+' [label="'+str(aux.nombre)+'\\n'+str(aux.pasword)+'"];\n')
                g.edge(str(aux.nombre)+str(aux.pasword), str(aux.next.nombre)+str(aux.next.pasword))
                g.body.append('[dir=both arrowhead=halfopen color=darkgreen]')
                aux = aux.next
                if (aux == self.last.next):
                    break
        g.body.append('label = "Lista Doblemente Enlazada de Usuarios"; \n')
        g.format = 'png'
        g.render('test-output/Lista-Usuario/graficaListaUsuarios.gv', view=True)
