from NodoCola import nodeCola
from Matriz import matriz
from graphviz import Digraph

class colaCircular:
    def __init__(self):
        self.front = None
        self.final = None

    def insertCola(self,element):

        if self.front == None:
            self.front = element
            self.final = element
        else:
            self.final.next = element
            element.prev = self.final
            self.final = element
            self.final.next = self.front
            self.front.prev = self.final

    def busquedaCancion(self,parametro1,parametro2, parametro3, parametro4, parametro5, parametro6):
        aux = self.front
        while True:
            if(aux.anio == parametro1 and aux.genero == parametro2 and aux.nodoB == parametro3 and aux.nodoABB == parametro4 and aux.nombre==parametro5 and aux.path == parametro6):
                return aux
            aux = aux.next
            if(aux == self.front):
                break
        return None

    def buscarCanciones(self,parametro1,parametro2, parametro3, parametro4, parametro5, parametro6):
        elemento = self.busquedaCancion(parametro1,parametro2, parametro3, parametro4, parametro5, parametro6)
        if(elemento != None):
            print str(elemento)
            if self.front == self.final:
                if(self.front == elemento):
                    self.front = None
                    self.final = None
            else:
                if self.front == elemento:
                    self.front = self.front.next
                    self.front.prev = self.final
                    self.final.next = self.front
                elif self.final == elemento:
                    self.final = self.final.prev
                    self.final.next = self.front
                    self.front.prev = self.final
                else:
                    aux = self.front
                    if aux!=None:
                        while True:
                            if(aux == elemento):
                                aux.next.prev = aux.prev
                                aux.prev.next = aux.next
                                return aux
                            aux = aux.next
                            if(aux== self.front):
                                break

    def buscarCanciones1(self,parametro1,parametro2, parametro3, parametro4, parametro5, parametro6):
        elemento = self.busquedaCancion(parametro1,parametro2, parametro3, parametro4, parametro5, parametro6)
        if(elemento != None):
            if self.front == self.final:
                if(self.front == elemento):
                    self.front = None
                    self.final = None
            else:
                if self.front == elemento:
                    self.front = self.front.next
                    self.front.prev = self.final
                    self.final.next = self.front
                elif self.final == elemento:
                    self.final = self.final.prev
                    self.final.next = self.front
                    self.front.prev = self.final
                else:
                    aux = self.front
                    if aux!=None:
                        while True:
                            if(aux == elemento):
                                aux.next.prev = aux.prev
                                aux.prev.next = aux.next
                                return aux
                            aux = aux.next
                            if(aux== self.front):
                                break


    def graficar(self,usuario):
        #self.verify()
        g = Digraph('G', filename='graficaColaCircular.gv')
        g.body.append('rankdir=LR')
        g.attr('node', shape='Mdiamond', color='blue')

        aux = self.front
        if aux == None:
            g.edge(usuario,str('Cola esta vacia'))
        else:
            g.body.append('"'+usuario+'"->"'+str(aux.nombre)+'"')
            g.body.append('subgraph cluster_0 {')
            g.body.append('style=filled; color=lightgrey; node [style=filled,color=white];')
            while True:
                g.edge(str(aux.nombre), str(aux.next.nombre))
                aux = aux.next
                if (aux == self.front):
                    break
            g.body.append('}')
            g.body.append('label = "Play List del Usuario";')
        g.format = 'png'
        g.render('test-output/Cola-PlayList/graficaColaCircular.gv', view=True)

    text = ""
    def recorrer(self):

        #self.text = ""
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

    def cadenaCanciones(self):

        cadena = ''
        aux = self.front
        if(aux ==None):
            return None
        else:
            while True:
                # print aux
                cadena += str(aux)
                aux = aux.next
                if (aux == self.front):
                    return cadena
