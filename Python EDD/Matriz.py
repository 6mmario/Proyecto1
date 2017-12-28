from NodoM import NodoE, NodoM, listaEncabezados


class Matriz:
    eFilas = listaEncabezados()
    eColumnas = listaEncabezados()

    text = ""

    def add(self, fila, columna, dato):
        news = NodoM(fila, columna, dato)
        # Insertar Filas
        eFila = self.eFilas.getEncabezado(fila)
        if (eFila == None):  # Si no existe el encabezado se crea
            eFila = NodoE(fila)
            self.eFilas.insertar(eFila)
            eFila.acceso = news
        else:
            if (news.columna < eFila.acceso.columna):
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
        #fin de las filas

        #inserto columnas

        eColumna = self.eColumnas.getEncabezado(columna)
        if(eColumna == None):
            eColumna = NodoE(columna)
            self.eColumnas.insertar(columna)
            eColumna.acceso = news
        else:
            if(news.fila < eColumna.acceso.fila): #inserto al inicio
                news.abajo = eColumna.acceso
                eColumna.acceso.arriba = news
                eColumna.acceso = news
            else:
                actual = eColumna.acceso
                while (actual.abajo != None):
                    if(news.fila < actual.abajo.fila): #insertar al medio
                        news.abajo = actual.abajo
                        actual.abajo.arriba = news
                        news.arriba = actual
                        actual.abajo = news
                        break
                    actual = actual.abajo

                    if(actual.abajo == None): #inserta al final
                        actual.abajo = news
                        news.arriba = actual

    def recorrerFilas(self):
        eFila = self.eFilas.primero
        print "Recorrer por Filas: "

        while (eFila != None):
            actual = eFila.acceso
            while  (actual !=None):
                print str(actual.valor)
                if(eFila.siguiente != None or actual.derecha != None):
                    print '->'
                actual = actual.derecha
            eFila = eFila.siguiente
        print 'Fin \n'

    def recorrerColumas(self):
        eColumna = self.eColumnas.primero
        print 'Recorrer por Columna: '

        while (eColumna != None):
            actual = eColumna.acceso
            while(actual!= None):
                print str(actual.valor)
                if(eColumna.siguiente != None or actual.abajo != None):
                    print "->"
                actual = actual.abajo
            eColumna = eColumna.siguiente
        print 'fin \n'

