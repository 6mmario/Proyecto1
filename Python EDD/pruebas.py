from idlelib.idle_test.test_io import BA

from MatrizDispersa import  MatrizDispersa
from ListaCircular import listaCircular
from NodoCircular import nodeCircular
from ColaCircular import colaCircular
from NodoCola import nodeCola
#from BTree import bTree

########################################
#       Matriz Disperza                #
########################################
# Matriz = MatrizDispersa()
#
# Matriz.Insertar(1993,'Musica clasica','Victor')
# Matriz.Insertar(2012,'Blues','Cadman')
# Matriz.Insertar(1984,'Jazz','Rahim')
# Matriz.Insertar(1982,'Rhythm and Blues (R&B)','Herrod')
# Matriz.Insertar(1999,'Rock and Roll','Marvin')
# Matriz.Insertar(1991,'Gospel','Cruz')
# Matriz.Insertar(1985,'Soul','Austin')
# Matriz.Insertar(2002,'Rock','Tanek')
# Matriz.Insertar(2003,'Metal','Tiger')
# Matriz.Insertar(2014,'Country','Lane')
# Matriz.Insertar(1984,'Funk','Kaseem')
# Matriz.Insertar(2012,'Disco','Knox')
# Matriz.Insertar(1985,'Cumbia','Clark')
# Matriz.Insertar(2002,'Techno','Axel')
# Matriz.Insertar(2010,'Pop','Phelan')
# Matriz.Insertar(1985,'Ska','Griffin')
# Matriz.Insertar(1994,'Reggae','Hiram')
# Matriz.Insertar(1987,'Hip Hop','Andrew')
# Matriz.Insertar(2014,'Drum and bass','Honorato')
# Matriz.Insertar(2004,'Garage','Justin')
# Matriz.Insertar(2003,'Flamenco','Drake')
# Matriz.Insertar(2007,'Salsa','Linus')
# Matriz.Insertar(2013,'Reggaeton','Drake')
# Matriz.Insertar(1986,'Banda sonora','Xander')
# Matriz.Insertar(2014,'Rhythm and Blues (R&B)','Prueba')
# Matriz.Insertar(2014,'Techno','Prueba')
# Matriz.Insertar(2017,'Z','Prueba')
# Matriz.Insertar(2017,'Z','Prueba')
#Matriz.Recorridox()
#Matriz.Recorridoy()
# Matriz.Grafica()
#Matriz.RecorrePorColumna()
#Matriz.RecorrerPorFila()

########################################
#       Lista Doblemente Enlazada      #
########################################

lista = listaCircular()
lista.search('obed','1234')
nodo = nodeCircular('Mario','1234')
lista.insert(nodo)
nodo = nodeCircular('Obed','1234')
lista.insert(nodo)
nodo = nodeCircular('Morales','1234')
lista.insert(nodo)
nodo = nodeCircular('Guitz','1234')
lista.insert(nodo)
nodo = nodeCircular('Jose','1234')
lista.insert(nodo)
nodo = nodeCircular('Diego','1234')
lista.insert(nodo)
nodo = nodeCircular('Perez','1234')
lista.insert(nodo)
nodo = nodeCircular('Toraya','1234')
lista.insert(nodo)
lista.graficar()
nodos = lista.search('Morales','1234')
lista.delete(nodos)
nodos = lista.search('Mario','1234')
lista.delete(nodos)
nodos = lista.search('Toraya','1234')
lista.delete(nodos)
nodos = lista.search('Obed','1234')
lista.delete(nodos)
lista.graficar()
lista.search('obed','1234')


########################################
#       Cola Circular                  #
########################################

# cola = colaCircular()
#
# nodo = nodeCola('hola')
# cola.insert(nodo)
# nodo = nodeCola('ke')
# cola.insert(nodo)
# nodo = nodeCola('ace')
# cola.insert(nodo)
# nodo = nodeCola('YO')
# cola.insert(nodo)
# nodo = nodeCola('Tengo')
# cola.insert(nodo)
# nodo = nodeCola('Mucho')
# cola.insert(nodo)
# nodo = nodeCola('Sue;o')
# cola.insert(nodo)
# cola.graficar()

########################################
#       B-tree                         #
########################################
