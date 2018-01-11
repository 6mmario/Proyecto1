class NodoM:
    def __init__(self, fila=None, columna=None, valor=None):
        self.fila = fila
        self.columna = columna
        self.valor = valor
        self.derecha = None
        self.izquierda = None
        self.arriba = None
        self.abajo = None
        self.accesoB = None
        self.accesB = None

    def __str__(self):
        return "*%s*%s" %(self.fila, self.columna)


class NodoE:
    def __init__(self, id=None):
        self.id = id
        self.siguiente = None
        self.anterior = None
        self.acceso = None

        def __str__(self):
            return self.id

class listaEncabezados:
    primero = None

    def insertar(self, nuevo):
        if (self.primero == None):
            self.primero = nuevo
        else:
            if (nuevo.id < self.primero.id):  # Inserto al Inicio
                nuevo.siguiente = self.primero
                self.primero.anterior = nuevo
                self.primero = nuevo
            else:
                actual = self.primero
                while (actual.siguiente != None):
                    if (str(nuevo.id) < str(actual.siguiente.id)):  # insertar al medio
                        nuevo.siguiente = actual.siguiente
                        actual.siguiente.anterior = nuevo
                        actual.siguiente = nuevo
                        break
                    actual = actual.siguiente
                if (actual.siguiente == None):  # insertar al final
                    actual.siguiente = nuevo
                    nuevo.anterior = actual

    def eliminarEncabezado(self,nodo):
        if(self.primero.siguiente == None):
            self.primero = None
        else:
            if(self.primero == nodo):
                self.primero = self.primero.siguiente
            else:
                temp= self.primero
                while temp.siguiente !=None:
                    if(temp == nodo):
                        temp.anterior.siguiente = temp.siguiente
                        temp.siguiente.anterior = temp.anterior
                        break
                    temp = temp.siguiente

                if(temp.siguiente == None):
                    if(temp == nodo):
                        temp.anterior.siguiente = None


    def getEncabezado(self, val):
        actual = self.primero
        while (actual != None):
            if (actual.id == val):
                return actual
            actual = actual.siguiente
        return None
