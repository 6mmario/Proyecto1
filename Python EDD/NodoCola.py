class nodeCola:
    def __init__(self,anio=None, genero=None, nodoB= None, nodoABB= None, nombre = None, path = None,elementCancion = None, next = None, prev = None):
        self.anio= anio
        self.genero = genero
        self.nodoB = nodoB
        self.nodoABB = nodoABB
        self.nombre = nombre
        self.path = path
        self.elementCancion = elementCancion
        self.next = next
        self.prev = prev

    def __str__(self):
        return "*%s*%s*%s*%s*%s*%s" %(self.anio, self.genero, self.nodoB, self.nodoABB, self.nombre, self.path)