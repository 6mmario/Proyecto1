from idlelib.idle_test.test_io import BA

from MatrizDispersa import  MatrizDispersa
from ListaCircular import listaCircular
from NodoCircular import nodeCircular
from ColaCircular import colaCircular
from NodoCola import nodeCola
from NodoCancion import nodeCancion
from arbolBinario import aBinary
from NodoBinario import nBinary
########################################
#       BBTree                         #
########################################

# abb = aBinary()
# nodo = nBinary('jose')
# abb.insert(nodo)
# nodo = nBinary('arbo')
# abb.insert(nodo)
# nodo = nBinary('pedr')
# abb.insert(nodo)
# nodo = nBinary('MAR')
# abb.insert(nodo)
# nodo = nBinary('a')
# abb.insert(nodo)
# nodo = nBinary('mari')
# abb.insert(nodo)
# nodo = nBinary('zor')
# abb.insert(nodo)
# nodo = nBinary('pedo')
# abb.insert(nodo)
# nodo = nBinary('mijo')
# abb.insert(nodo)
# aux = abb.getRoot()
# # abb.inOrder(aux)
#
# abb.search('mijo',aux)
#
# # abb.graficar()
# aux = abb.search('pedr',aux)
# print aux
# nodo = nodeCancion('Maluma','cjfkdjf')
# abb.insertListaCircular(aux,nodo)
# nodo = nodeCancion('Ozuna','cjfkdjf')
# abb.insertListaCircular(aux,nodo)
# nodo = nodeCancion('Que','cjfkdjf')
# abb.insertListaCircular(aux,nodo)
# nodo = nodeCancion('Xumo','cjfkdjf')
# abb.insertListaCircular(aux,nodo)
# nodo = nodeCancion('me','cjfkdjf')
# abb.insertListaCircular(aux,nodo)
# nodo = nodeCancion('siento','cjfkdjf')
# abb.insertListaCircular(aux,nodo)
# abb.graficar()


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
nodo = nodeCircular('Heber','1234')
lista.insert(nodo)

aux = lista.search('Heber','1234')
print aux
nodo = nodeCola('hola')
lista.insertColaCanciones(aux,nodo)
nodo = nodeCola('ke')
lista.insertColaCanciones(aux,nodo)
nodo = nodeCola('ace')
lista.insertColaCanciones(aux,nodo)

aux = lista.search('Obed','1234')
print aux
nodo = nodeCola('Vos')
lista.insertColaCanciones(aux,nodo)
nodo = nodeCola('Sos')
lista.insertColaCanciones(aux,nodo)
nodo = nodeCola('Un')
lista.insertColaCanciones(aux,nodo)
nodo = nodeCola('Crack')
lista.insertColaCanciones(aux,nodo)
lista.graficar()


########################################
#       Cola Circular                  #
########################################
#
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
