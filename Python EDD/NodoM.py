class NodoM:
    def __init__(self, fila=None, columna=None, valor=None, derecha=None, izquierda=None, arriba=None, abajo=None):
        self.fila = fila
        self.columna = columna
        self.valor = valor
        self.derecha = derecha
        self.izquierda = izquierda
        self.arriba = arriba
        self.abajo = abajo


class NodoE:
    def __init__(self, id=None, siguiente=None, anterior=None, acceso=None):
        self.id = id
        self.siguiente = siguiente
        self.anterior = anterior
        self.acceso = acceso

        def __str__(self):
            return "%s" % (self.id)

class listaEncabezados:
    primero = NodoE()

    def insertar(self, nuevo):
        if (self.primero == None):
            self.primero = nuevo
        else:
            if (str(nuevo.id) < self.primero.id):  # Inserto al Inicio
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

    def getEncabezado(self, val):
        actual = self.primero
        while (actual != None):
            if (actual.id == val):
                return actual
            actual = actual.siguiente
        return None
