from setuptools.command.easy_install import easy_install

from NodoM import NodoE, NodoM, listaEncabezados
from BTree import BTree
from tempBTree import tBTree
from tempBTreeNode import NodeTree

from graphviz import Digraph


class matriz:
    eFilas = listaEncabezados()
    eColumnas = listaEncabezados()

    text = ""

    def add(self, fila, columna, dato):
        news = NodoM(fila, columna, dato)
        # verificar[e si existen o no los nodos
        temp = self.buscar(fila + '-' + columna)
        if (temp == None):
            # Insertar Filas
            eFila = self.eFilas.getEncabezado(fila)
            if (eFila == None):  # Si no existe el encabezado se crea
                eFila = NodoE(fila)
                self.eFilas.insertar(eFila)
                eFila.acceso = news
            else:
                if (news.columna < eFila.acceso.columna):  # inserto al inicio
                    news.derecha = eFila.acceso
                    eFila.acceso.izquierda = news
                    eFila.acceso = news
                else:
                    actual = eFila.acceso
                    while (actual.derecha != None):
                        if (news.columna < actual.derecha.columna):  # inserto al medio
                            news.derecha = actual.derecha
                            actual.derecha.izquierda = news
                            news.izquierda = actual
                            actual.derecha = news
                            break
                        actual = actual.derecha

                    if (actual.derecha == None):  # inserto al final
                        actual.derecha = news
                        news.izquierda = actual
            # fin de las filas

            # inserto columnas

            eColumna = self.eColumnas.getEncabezado(columna)
            if (eColumna == None):
                eColumna = NodoE(columna)
                self.eColumnas.insertar(eColumna)
                eColumna.acceso = news
            else:
                if (news.fila < eColumna.acceso.fila):  # inserto al inicio
                    news.abajo = eColumna.acceso
                    eColumna.acceso.arriba = news
                    eColumna.acceso = news
                else:
                    actual = eColumna.acceso
                    while (actual.abajo != None):
                        if (news.fila < actual.abajo.fila):
                            news.abajo = actual.abajo
                            actual.abajo.arriba = news
                            news.arriba = actual
                            actual.abajo = news
                            break
                        actual = actual.abajo

                    if (actual.abajo == None):
                        actual.abajo = news
                        news.arriba = actual

    def eliminarColumna(self,fila, columna):
        eColumna = self.eColumnas.getEncabezado(columna)
        if(eColumna!=None):
            if (eColumna.acceso == None):
                self.eColumnas.eliminarEncabezado(eColumna)
            else:
                aux = eColumna.acceso
                if(aux.abajo==None): #unico Nodo en la columna
                    eColumna.acceso=None
                    self.eliminarColumna(fila,columna)
                else:
                    if(aux.fila == fila and aux.columna == columna):#elimina el primero Nodo de la columna
                        eColumna.acceso = eColumna.acceso.abajo
                    else:
                        temp = eColumna.acceso
                        while(temp.abajo!=None):
                            if(temp.fila == fila and temp.columna== columna):
                                temp.arriba.abajo = temp.abajo
                                temp.abajo.arriba = temp.arriba
                                break
                            temp = temp.abajo

                        if(temp.abajo == None):
                            if(temp.fila == fila and temp.columna == columna):
                                temp.arriba.abajo = None

    def eliminarFila(self,fila, columna):
        eFila = self.eFilas.getEncabezado(fila)
        if(eFila !=None):
            if (eFila.acceso == None):
                self.eFilas.eliminarEncabezado()
            else:
                aux = eFila.acceso
                if(aux.derecha==None): #unico Nodo en la columna
                    eFila.acceso=None
                else:
                    if(aux.fila == fila and aux.columna == columna):#elimina el primero Nodo de la columna
                        eFila.acceso = eFila.acceso.derecha
                    else:
                        temp = eFila.acceso
                        while(temp.derecha!=None):
                            if(temp.fila == fila and temp.columna== columna):
                                temp.izquierda.derecha = temp.derecha
                                temp.derecha.izquierda = temp.izquierda
                                break
                            temp = temp.derecha

                        if(temp.derecha == None):
                            if(temp.fila == fila and temp.columna == columna):
                                temp.izquierda.derecha = None



    def insertB(self, elementMatriz, elementB):
        if (elementMatriz != None):
            if (elementMatriz.accesoB == None):
                bbtre = BTree(5)
                elementMatriz.accesoB = bbtre
                bbtre.add(elementB)
                # metodo opcional
                tempT = tBTree()
                elementMatriz.accesB = tempT
                nodeBT = NodeTree(elementB)
                tempT.insert(nodeBT)
            else:
                elementMatriz.accesoB.add(elementB)
                # metodo opcional
                nodeBT = NodeTree(elementB)
                elementMatriz.accesB.insert(nodeBT)

    def recorrerB(self, arbol):
        arbol.root.pretty_print()

    def buscarAlbum(self, nombreAlbum):
        aux = self.eColumnas.primero
        if aux != None:  # primero de las columnas
            while aux != None:
                temp = aux.acceso  # el acceso a los nodos internos
                while temp != None:
                    lArtista = temp.accesB  # asigno el Arbol B
                    if (lArtista != None):  #
                        t, lAlbum = lArtista.recorrerArtistas(nombreAlbum)  # busco en toda la lista de al
                        if lAlbum != None:
                            lista = lAlbum.acceso
                            lista.graficarListaCanciones(nombreAlbum)
                            return 'True'
                    temp = temp.abajo
                aux = aux.siguiente
        return None

    def buscarAlbum2(self, nombreAlbum):
        aux = self.eColumnas.primero
        if aux != None:  # primero de las columnas
            while aux != None:
                temp = aux.acceso  # el acceso a los nodos internos
                while temp != None:
                    lArtista = temp.accesB  # asigno el Arbol B
                    if (lArtista != None):  #
                        nombreArtista, lAlbum = lArtista.recorrerArtistas(nombreAlbum)  # busco en toda la lista de al
                        if lAlbum != None:
                            lista = lAlbum.acceso
                            texto = lista.Canciones()
                            # anio*genero
                            # print str(temp) +'*'+nombreArtista
                            return str(temp) + '*' + nombreArtista + texto
                    temp = temp.abajo
                aux = aux.siguiente
        return None

    def buscarArtista(self, nodomatriz, nombreArtista):
        aux = self.eColumnas.primero
        if aux != None:  # primero de las columnas
            while aux != None:
                temp = aux.acceso  # el acceso a los nodos internos
                while temp != None:
                    if (temp.valor == nodomatriz):
                        aArtist, aArtista = temp.accesB, temp.accesoB
                        estado = aArtista.delete(nombreArtista)
                        if (estado == False):
                            print str(estado)
                            return None
                        node = aArtist.searchArtista(nombreArtista)
                        aArtist.elminarArtista(node)
                        return True
                    temp = temp.abajo
                aux = aux.siguiente
        return None

    def comparar(self,nodo):
        aux = self.eColumnas.primero
        if (aux !=None):
            while aux != None:
                temp = aux.acceso
                while temp != None:
                    if (temp == nodo):
                        return temp
                    temp = temp.abajo
                aux = aux.siguiente

    nvariable = ''
    def generarporAnio(self,anio):
        self.nvariable = ''
        encontrado1 = False
        aux = self.eFilas.primero
        if(aux != None):
            while aux!=None:
                if(aux.id == anio):
                    temp = aux.acceso
                    while temp != None:
                        encontrado = self.comparar(temp)
                        aArtista = encontrado.accesB
                        if (aArtista != None):
                            encontrado1 = True
                            self.nvariable += '*' + 'Nombre: *' + str(encontrado.valor) + '*'
                            todasCancioes = aArtista.recorrerTodosArtistas()
                            self.nvariable += todasCancioes
                        temp = temp.derecha
                aux = aux.siguiente

        if (encontrado1 == True):
           return self.nvariable
        else:
            return 'False'

    def apuntarCanciones(self, anio, genero, artista, album, cancion, path):
        aux = self.eColumnas.primero
        if aux != None:  # primero de las columnas
            while aux != None:
                temp = aux.acceso  # el acceso a los nodos internos
                while temp != None:
                    if (temp.valor == (anio + '-' + genero)):
                        lArtista = temp.accesB  # asigno el Arbol B
                        nodeArtista = lArtista.searchArtista(artista)
                        if (nodeArtista != None):
                            lAlbum = nodeArtista.accesoBinario
                            root = lAlbum.getRoot()
                            nodeAlbum = lAlbum.search(album,root)
                            if(nodeAlbum != None):
                                lCancion = nodeAlbum.acceso
                                if(lCancion != None):
                                    Cancion = lCancion.searchCancion(cancion,path)
                                    if(Cancion != None):
                                        return Cancion
                    temp = temp.abajo
                aux = aux.siguiente
        return None

    def eliminarCanciones(self, anio, genero, artista, album, cancion, path):
        aux = self.eColumnas.primero
        if aux != None:  # primero de las columnas
            while aux != None:
                temp = aux.acceso  # el acceso a los nodos internos
                while temp != None:
                    if (temp.valor == (anio + '-' + genero)):
                        lArtista = temp.accesB  # asigno el Arbol B
                        nodeArtista = lArtista.searchArtista(artista)
                        if (nodeArtista != None):
                            lAlbum = nodeArtista.accesoBinario
                            root = lAlbum.getRoot()
                            nodeAlbum = lAlbum.search(album,root)
                            if(nodeAlbum != None):
                                lCancion = nodeAlbum.acceso
                                if(lCancion != None):
                                    Cancion = lCancion.searchCancion(cancion,path)
                                    lCancion.deleteCancion(Cancion)
                    temp = temp.abajo
                aux = aux.siguiente

    def buscarCanciones(self, anio, genero, artista, album, cancion, path):
        aux = self.eColumnas.primero
        if aux != None:  # primero de las columnas
            while aux != None:
                temp = aux.acceso  # el acceso a los nodos internos
                while temp != None:
                    if (temp.valor == (anio + '-' + genero)):
                        lArtista = temp.accesB  # asigno el Arbol B
                        nodeArtista = lArtista.searchArtista(artista)
                        if (nodeArtista != None):
                            lAlbum = nodeArtista.accesoBinario
                            root = lAlbum.getRoot()
                            nodeAlbum = lAlbum.search(album,root)
                            if(nodeAlbum != None):
                                lCancion = nodeAlbum.acceso
                                if(lCancion != None):
                                    Cancion = lCancion.searchCancion(cancion,path)
                                    return Cancion
                    temp = temp.abajo
                aux = aux.siguiente

    def recorrerFilas(self):
        eFila = self.eFilas.primero
        print "Recorrer por Filas: "

        while (eFila != None):
            print '-----------------' + eFila.id
            actual = eFila.acceso
            while (actual != None):
                print str(actual.valor)
                if (eFila.siguiente != None or actual.derecha != None):
                    print '->'
                actual = actual.derecha
            eFila = eFila.siguiente
        print 'Fin \n'

    def buscar(self, dato):
        eColumna = self.eColumnas.primero
        while (eColumna != None):
            actual = eColumna.acceso
            while (actual != None):
                if (actual.valor == dato):
                    return actual
                actual = actual.abajo
            eColumna = eColumna.siguiente
        return None

    def recorrerColumas(self):
        eColumna = self.eColumnas.primero
        print 'Recorrer por Columna: '

        while (eColumna != None):
            print '-----------------' + eColumna.id
            actual = eColumna.acceso
            while (actual != None):
                print str(actual.valor)
                if (eColumna.siguiente != None or actual.abajo != None):
                    print "->"
                actual = actual.abajo
            eColumna = eColumna.siguiente
        print 'fin \n'

    txt = ''
    canciones = ''
    def todasCanciones(self):
        self.canciones = ''
        eColumna = self.eColumnas.primero
        while (eColumna != None):
            actual = eColumna.acceso #nodo de las Canciones
            while (actual != None):
                self.canciones+='*Nombre: *'+str(actual.valor)
                lArtistas = actual.accesB
                if(lArtistas !=None):
                    self.canciones += lArtistas.todosArtistas()
                actual = actual.abajo
            eColumna = eColumna.siguiente
        return self.canciones

    def recorrerColumasCanciones(self, genero):
        self.txt = ''
        encontrado = False
        eColumna = self.eColumnas.primero
        while (eColumna != None):
            if (eColumna.id == genero):
                actual = eColumna.acceso
                while (actual != None):
                    aArtista = actual.accesB
                    if (aArtista != None):
                        encontrado = True
                        self.txt += '*' + 'Nombre: ' + str(actual) + '*'
                        todasCancioes = aArtista.recorrerTodosArtistas()
                        self.txt += todasCancioes
                    actual = actual.abajo
            eColumna = eColumna.siguiente
        if (encontrado == True):
           return self.txt
        else:
            return 'False'

    def recorrerArtistasCanciones(self, artista):
        self.txt = ''
        encontrado = False
        eColumna = self.eColumnas.primero
        while (eColumna != None):
            actual = eColumna.acceso
            while (actual != None):
                aArtista = actual.accesB
                if (aArtista != None):
                    nodoArtista = aArtista.searchArtista(artista)
                    if (nodoArtista != None):
                        encontrado = True
                        self.txt += '*' + 'Nombre: ' + str(actual)
                        aAlbum = nodoArtista.accesoBinario
                        root = aAlbum.getRoot()  # obtengo la raiz de todos los nodos
                        aAlbum.todosNodos(root)
                        self.txt += aAlbum.retornarCanciones()
                actual = actual.abajo
            eColumna = eColumna.siguiente

        if (encontrado == True):
           return self.txt
        else:
            return 'False'

    def graficar(self):
        self.text = ""
        g = Digraph('G', filename='MatrizDispersaNEW.gv')
        g.body.append('rankdir=UD')
        g.attr('node', shape='box', color='blue')
        # Grafica de los Encabezados X
        # {rank=min;"Matriz";"x0";"x1";"x3";"x4";};
        eC = self.eColumnas.primero
        if (eC != None):
            self.text += ('{rank = min;"MATRIZ";')
            while eC.siguiente != None:
                self.text += ('"' + str(eC.id) + '";')
                eC = eC.siguiente
            self.text += '}; \n'
            g.body.append(str(self.text))
        # grafica de las filas de la matriz
        # {rank=same;"y1";"xy: 0,1 \n FFFFFF"; "xy: 1,1 \n B38B18"; "xy: 3,1 \n FFFFFF"; "xy: 4,1 \n B38B18"; };
        eF = self.eFilas.primero
        self.text = ''
        while eF != None:
            self.text += '{rank = same;"' + str(eF.id) + '";'
            temp = eF.acceso
            while temp != None:
                self.text += '"' + str(temp.valor) + '";'
                temp = temp.derecha
            self.text += '};\n'
            eF = eF.siguiente
        g.body.append(str(self.text))

        # grafica entre columnas
        # "xy: 0,3 \n B38B18"->"xy: 0,1 \n FFFFFF"
        eC1 = self.eColumnas.primero
        self.text = ''
        while (eC1 != None):
            actual = eC1.acceso
            while (actual != None):
                if (actual.abajo != None):
                    self.text += '"' + str(actual.valor) + '"' + '->' + '"' + str(actual.abajo.valor) + '"\n'
                    self.text += '"' + str(actual.abajo.valor) + '"' + '->' + '"' + str(actual.valor) + '"\n'
                actual = actual.abajo
            eC1 = eC1.siguiente
        g.body.append(str(self.text))

        # grafica entre encabezados y accesos de X
        # "x0"->"xy: 0,1 \n FFFFFF";
        eC2 = self.eColumnas.primero
        self.text = ''
        while (eC2 != None):
            self.text += '"' + str(eC2.id) + '"'
            temp = eC2.acceso
            if (temp != None):
                self.text += '->' + '"' + str(temp.valor) + '";\n'
            eC2 = eC2.siguiente
        g.body.append(str(self.text))

        # grafica entre filas
        # "xy: 0,1 \n FFFFFF"->"xy: 1,1 \n B38B18"[constraint=false];
        eF2 = self.eFilas.primero
        self.text = ''
        while (eF2 != None):
            actual = eF2.acceso
            while (actual != None):
                if (actual.derecha != None):
                    self.text += '"' + str(actual.valor) + '"' + '->' + '"' + str(
                        actual.derecha.valor) + '"[constraint = false]; \n'
                    self.text += '"' + str(actual.derecha.valor) + '"' + '->' + '"' + str(
                        actual.valor) + '"[constraint = false]; \n'
                actual = actual.derecha
            eF2 = eF2.siguiente
        g.body.append(str(self.text))

        # grafica filas y accesos
        # "y1"->"xy: 0,1 \n FFFFFF";
        eF1 = self.eFilas.primero
        self.text = ''
        while (eF1 != None):
            self.text += '"' + str(eF1.id) + '"'
            temp = eF1.acceso
            if (temp != None):
                self.text += '->' + '"' + str(temp.valor) + '";\n'
            eF1 = eF1.siguiente
        g.body.append(str(self.text))

        # relacion entre encabezados partiendo de Matriz columnas
        # Matriz->x0;
        eC3 = self.eColumnas.primero
        self.text = ''
        self.text += '"MATRIZ" -> ' + '"' + str(eC3.id) + '";\n'
        while (eC3.siguiente != None):
            self.text += '"' + str(eC3.id) + '"->"' + str(eC3.siguiente.id) + '";\n'
            eC3 = eC3.siguiente
        g.body.append(str(self.text))

        # relacion entre encabezados partiendo de Matriz filas
        # Matriz->y1[rankdir=UD];
        eF3 = self.eFilas.primero
        self.text = ''
        self.text += '"MATRIZ" -> ' + '"' + str(eF3.id) + '"[rankdir=UD];\n'
        while (eF3.siguiente != None):
            self.text += '"' + str(eF3.id) + '"->"' + str(eF3.siguiente.id) + '"[rankdir=UD];\n'
            eF3 = eF3.siguiente
        g.body.append(str(self.text))
        g.body.append('label = "Matriz Dispersa"; \n')
        g.format = 'png'
        g.render('test-output/Matriz-Dispersa/MatrizDispersaNEW.gv', view=True)
