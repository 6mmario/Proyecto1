# # from idlelib.idle_test.test_io import BA
#
# from MatrizDispersa import  MatrizDispersa
# from ListaCircular import listaCircular
# from NodoCircular import nodeCircular
# from ColaCircular import colaCircular
# from NodoCola import nodeCola
# from NodoCancion import nodeCancion
# from arbolBinario import aBinary
# from NodoBinario import nBinary
from Matriz import matriz
#
#
# # # ########################################
# # # #       BBTree                         #
# # # ########################################
# #
# # # abb = aBinary()
# # # nodo = nBinary('jose')
# # # abb.insert(nodo)
# # # nodo = nBinary('arbo')
# # # abb.insert(nodo)
# # # nodo = nBinary('pedr')
# # # abb.insert(nodo)
# # # nodo = nBinary('MAR')
# # # abb.insert(nodo)
# # # nodo = nBinary('a')
# # # abb.insert(nodo)
# # # nodo = nBinary('mari')
# # # abb.insert(nodo)
# # # nodo = nBinary('zor')
# # # abb.insert(nodo)
# # # nodo = nBinary('pedo')
# # # abb.insert(nodo)
# # # nodo = nBinary('mijo')
# # # abb.insert(nodo)
# # # aux = abb.getRoot()
# # # abb.inOrder(aux)
# # # #
# # # # abb.search('mijo',aux)
# # # #
# # # abb.graficarBinario()
# # # # aux = abb.search('pedr',aux)
# # # # print aux
# # # # nodo = nodeCancion('Maluma','cjfkdjf')
# # # # abb.insertListaCircular(aux,nodo)
# # # # nodo = nodeCancion('Ozuna','cjfkdjf')
# # # # abb.insertListaCircular(aux,nodo)
# # # # nodo = nodeCancion('Que','cjfkdjf')
# # # # abb.insertListaCircular(aux,nodo)
# # # # nodo = nodeCancion('Xumo','cjfkdjf')
# # # # abb.insertListaCircular(aux,nodo)
# # # # nodo = nodeCancion('me','cjfkdjf')
# # # # abb.insertListaCircular(aux,nodo)
# # # # nodo = nodeCancion('siento','cjfkdjf')
# # # # abb.insertListaCircular(aux,nodo)
# # # # abb.graficar()
# # #
# # #
# # # ########################################
# # # # #       Matriz Disperza                #
# # # # ########################################
# # # Matriz = MatrizDispersa()
# # #
# # # Matriz.Insertar(1900, 'POP', '1900-POP')
# # # Matriz.Insertar(1993, 'Musica clasica', '1993-MUSICA CLASICA')
# # # Matriz.Insertar(2012, 'Blues', '2012-BLUES')
# # # Matriz.Insertar(1984, 'Jazz', '1984-JAZZ')
# # # Matriz.Insertar(1982, 'Rhythm and Blues (R&B)', '1982-Rhythm and Blues (R&B)')
# # # Matriz.Insertar(1999, 'Rock and Roll', '1999-ROCK AND ROLL')
# # # Matriz.Insertar(1991, 'Gospel', '1991-GOSPEL')
# # # Matriz.Insertar(1985, 'Soul', '1985-SOUL')
# # # Matriz.Insertar(2002, 'Rock', '2002-ROCK')
# # # Matriz.Insertar(2003, 'Metal', '2003-METAL')
# # # Matriz.Insertar(2014, 'Country', '2014-COUNTRY')
# # # Matriz.Insertar(1984, 'Funk', '1984-FUNK')
# # # Matriz.Insertar(2012, 'Disco', '2012-DISCO')
# # # Matriz.Insertar(1985, 'Cumbia', '1985-CUMBIA')
# # # Matriz.Insertar(2002, 'Techno', '2002-TECHNO')
# # # Matriz.Insertar(2010, 'Pop', '2010-POP')
# # # Matriz.Insertar(1985, 'Ska', '1985-SKA')
# # # Matriz.Insertar(1994, 'Reggae', '1994-REGGAE')
# # # Matriz.Insertar(1987, 'Hip Hop', '1987-HOP')
# # # Matriz.Insertar(2014, 'Drum and bass', '2014-DRUM AND BASSA')
# # # Matriz.Insertar(2004, 'Garage', '2004-GARAGE')
# # # Matriz.Insertar(2003, 'Flamenco', '2003-FLAMENCO')
# # # Matriz.Insertar(2007, 'Salsa', '2007-SALSA')
# # # Matriz.Insertar(2013, 'Reggaeton', '2013-REGGAETON')
# # # Matriz.Insertar(1986, 'Banda sonora', '1986-BANDA SONORA')
# # # Matriz.Insertar(2014, 'Rhythm and Blues (R&B)', '2014-Rhythm and Blues (R&B)')
# # # Matriz.Insertar(2014, 'Techno', '2014-TECHNO')
# # # Matriz.Insertar(2017, 'Z', '2017-Z')
# # # Matriz.Grafica()
# # # aux = Matriz.buscarColumnas('2017-Z')
# # # print 'esto: ' + str(aux.date)
# # # Matriz.insertB(aux,7)
# # # Matriz.insertB(aux,25)
# # # Matriz.insertB(aux,27)
# # # Matriz.insertB(aux,15)
# # # Matriz.insertB(aux,23)
# # # Matriz.insertB(aux,19)
# # # Matriz.insertB(aux,14)
# # # Matriz.insertB(aux,29)
# # # Matriz.insertB(aux,10)
# # # Matriz.insertB(aux,50)
# # # Matriz.insertB(aux,18)
# # # Matriz.insertB(aux,22)
# # # Matriz.insertB(aux,46)
# # # Matriz.insertB(aux,17)
# # # Matriz.insertB(aux,70)
# # # Matriz.insertB(aux,33)
# # # Matriz.insertB(aux,58)
# # # Matriz.recorrerB(aux.accesoB)
# # #
# # # aux1 = Matriz.buscarColumnas('2012-DISCO')
# # # print 'esto ' + str(aux1.date)
# # # Matriz.insertB(aux1,'moto')
# # # Matriz.insertB(aux1,'mota')
# # # Matriz.insertB(aux1,'pedo')
# # # Matriz.insertB(aux1,'casa')
# # # Matriz.insertB(aux1,'dedo')
# # # Matriz.insertB(aux1,'pato')
# # # Matriz.insertB(aux1,'bano')
# # # Matriz.insertB(aux1,'tapa')
# # # Matriz.insertB(aux1,'open')
# # # Matriz.insertB(aux1,'logo')
# # # Matriz.insertB(aux1,'rosa')
# # # Matriz.insertB(aux1,'caja')
# # # Matriz.insertB(aux1,'pesa')
# # # Matriz.insertB(aux1,'flor')
# # # Matriz.insertB(aux1,'fast')
# # # Matriz.insertB(aux1,'jose')
# # # Matriz.insertB(aux1,'obed')
# # # Matriz.insertB(aux1,'lobo')
# # # Matriz.insertB(aux1,'loro')
# # # Matriz.insertB(aux1,'lodo')
# # # Matriz.recorrerB(aux1.accesoB)
# #
# #
# # # #
# # # ########################################
# # # #       Lista Doblemente Enlazada      #
# # # ########################################
# # #
# lista = listaCircular()
# nodo = nodeCircular('Mario','1234')
# lista.insert(nodo)
# #nodo = nodeCircular('Obed','1234')
# #lista.insert(nodo)
# #nodo = nodeCircular('Morales','1234')
# #lista.insert(nodo)
# # nodo = nodeCircular('Guitz','1234')
# # lista.insert(nodo)
# # nodo = nodeCircular('Jose','1234')
# # lista.insert(nodo)
# # nodo = nodeCircular('Diego','1234')
# # lista.insert(nodo)
# # nodo = nodeCircular('Perez','1234')
# # lista.insert(nodo)
# nodo = nodeCircular('Toraya','1234')
# lista.insert(nodo)
# # nodo = nodeCircular('Heber','1234')
# # lista.insert(nodo)
# lista.graficar()
# nodo = lista.search('Mario','1234')
# lista.delete(nodo)
# lista.graficar()
# nodo = lista.search('Toraya','1234')
# lista.delete(nodo)
# lista.graficar()
#
# #
# # #
# # #
# # # ########################################
# # # #       Cola Circular                  #
# # # ########################################
# # # #
# # # # cola = colaCircular()
# # # #
# # # # nodo = nodeCola('hola')
# # # # cola.insert(nodo)
# # # # nodo = nodeCola('ke')
# # # # cola.insert(nodo)
# # # # nodo = nodeCola('ace')
# # # # cola.insert(nodo)
# # # # nodo = nodeCola('YO')
# # # # cola.insert(nodo)
# # # # nodo = nodeCola('Tengo')
# # # # cola.insert(nodo)
# # # # nodo = nodeCola('Mucho')
# # # # cola.insert(nodo)
# # # # nodo = nodeCola('Sue;o')
# # # # cola.insert(nodo)
# # # # cola.graficar()
# # #
# # #
# # # ########################################
# # # #       Matriz Mejorada hahahah        #
# # # ########################################
# #
# # # matriz = Matriz()
# # #
# # # matriz.add('1900','pop','sor')
# #
# # # ########################################
# # # #       BTree                          #
# # # ########################################
# # from ArbolB import BTree
# # #
# # # tree = BTree(5)
# #
# # # tree.add('moto')
# # # tree.add('mota')
# # # tree.add('pedo')
# # # tree.add('casa')
# # # tree.add('dedo')
# # # tree.add('pato')
# # # tree.add('bano')
# # # tree.add('tapa')
# # # tree.add('open')
# # # tree.add('logo')
# # # tree.add('rosa')
# # # tree.add('caja')
# # # tree.add('pesa')
# # # tree.add('flor')
# # # tree.add('fast')
# # # tree.add('jose')
# # # tree.add('obed')
# # # tree.add('lobo')
# # # tree.add('loro')
# # # tree.add('lodo')
# # # tree.root.pretty_print()
# # #aux = tree.search('loro')
# # #print str(aux)
# #
# # # ########################################
# # # #       BTree                          #
# # # # ########################################
# # # from ArbolB import BTree
# # #
# # # tree = BTree(5)
# # #
# # # tree.add('moto')
# # # tree.add('mota')
# # # tree.add('pedo')
# # # tree.add('casa')
# # # tree.add('dedo')
# # # tree.add('pato')
# # # tree.add('bano')
# # # tree.add('tapa')
# # # tree.add('open')
# # # tree.add('logo')
# # # tree.add('rosa')
# # # tree.add('caja')
# # # tree.add('pesa')
# # # tree.add('flor')
# # # tree.add('fast')
# # # tree.add('jose')
# # # tree.add('obed')
# # # tree.add('lobo')
# # # tree.add('loro')
# # # tree.add('lodo')
# # # tree.root.pretty_print()
# # # tree.root.otraGrafica()
# #
matriz = matriz()
matriz.add("1900", 'POP', '1900-POP')
matriz.add("1993", 'Musica clasica', '1993-MUSICA CLASICA')
matriz.add("2012", 'Blues', '2012-BLUES')
matriz.add("1984", 'Jazz', '1984-JAZZ')
matriz.add("1982", 'Rhythm and Blues (R&B)', '1982-Rhythm and Blues (R&B)')
matriz.add("1999", 'Rock and Roll', '1999-ROCK AND ROLL')
matriz.add("1991", 'Gospel', '1991-GOSPEL')
matriz.add("1985", 'Soul', '1985-SOUL')
matriz.add("2002", 'Rock', '2002-ROCK')
matriz.add("2003", 'Metal', '2003-METAL')
matriz.add("2014", 'Country', '2014-COUNTRY')
matriz.add("1984", 'Funk', '1984-FUNK')
matriz.add("2012", 'Disco', '2012-DISCO')
matriz.add("1985", 'Cumbia', '1985-CUMBIA')
matriz.add("2002", 'Techno', '2002-TECHNO')
matriz.add("2010", 'Pop', '2010-POP')
matriz.add("1985", 'Ska', '1985-SKA')
matriz.add("1994", 'Reggae', '1994-REGGAE')
matriz.add("1987", 'Hip Hop', '1987-HOP')
matriz.add("2014", 'Drum and bass', '2014-DRUM AND BASSA')
matriz.add("2004", 'Garage', '2004-GARAGE')
matriz.add("2003", 'Flamenco', '2003-FLAMENCO')
matriz.add("2007", 'Salsa', '2007-SALSA')
matriz.add("2013", 'Reggaeton', '2013-REGGAETON')
matriz.add("1986", 'Banda sonora', '1986-BANDA SONORA')
matriz.add("2014", 'Rhythm and Blues (R&B)', '2014-Rhythm and Blues (R&B)')
matriz.add("2014", 'Techno', '2014-TECHNO')
matriz.add("2017", 'Z', '2017-Z')
# matriz.graficar()
#
# matriz.eliminarColumna("1982", 'Rhythm and Blues (R&B)')
# matriz.eliminarFila("1982", 'Rhythm and Blues (R&B)')
# matriz.graficar()
matriz.eliminarColumna("2017", 'Z')
matriz.eliminarFila("2017", 'Z')
matriz.graficar()