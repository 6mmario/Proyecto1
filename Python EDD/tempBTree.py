from arbolBinario import aBinary
from NodoBinario import nBinary
from graphviz import Digraph

class tBTree:

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

    def searchArtista(self, nombre):
        aux = self.first
        if (aux != None):
            while aux!= None:
                if (aux.nombreArtista == nombre):
                    return aux
                aux = aux.next
        return None

    def elminarArtista(self,nodo):
        aux = self.first
        if (aux != None):
            if(nodo == self.first == self.last):
                self.first =None
                self.last = None
            elif(nodo==self.first):
                self.first = self.first.next
            elif(nodo == self.last):
                self.last = self.last.prev
            else:
                while aux != None:
                    if(aux == nodo):
                        aux.prev.next = aux.next
                        aux.next.prev = aux.prev
                    aux = aux.next

    def recorrerArtistas(self, nombreAlbum):
        aux = self.first
        if (aux != None):
            while aux !=None:
                abb = aux.accesoBinario
                if(abb!= None):#esto contiene el ABB
                    root = abb.getRoot()
                    album = abb.search(nombreAlbum,root)
                    if(album != None): #tengo el nodo del album
                        #print str(aux)
                        return str(aux), album
                aux = aux.next
        return None, None

    artistas = ''
    def todosArtistas(self):
        self.artistas = ''
        aux = self.first
        if(aux != None):
            while aux!=None:
                lAlbum = aux.accesoBinario
                if(lAlbum != None):
                    self.artistas += '*Artista: *' + str(aux)
                    root = lAlbum.getRoot()
                    lAlbum.todosAlbums(root)
                    self.artistas+= lAlbum.regresarCadena()
                aux = aux.next
        return self.artistas

    txt = ''
    def recorrerTodosArtistas(self):
        self.txt = ''
        aux = self.first
        if (aux != None):
            while aux !=None:
                abb = aux.accesoBinario
                if(abb!= None):#esto contiene el ABB
                    root = abb.getRoot()#obtengo la raiz de todos los nodos
                    abb.todosNodos(root)
                    self.txt+='*Artista: *'+str(aux)
                    self.txt += abb.retornarCanciones()
                aux = aux.next
        return self.txt

    def insertarBinario(self, elementB, elementBBT):
        nodo = nBinary(elementBBT)
        if (elementB != None):
            if(elementB.accesoBinario == None):
                binario = aBinary()
                elementB.accesoBinario = binario
                binario.insert(nodo)
            else:
                elementB.accesoBinario.insert(nodo)

    def recorrerABB(self, arbolBB, nombreArtista):
        arbolBB.graficarBinario(nombreArtista)

