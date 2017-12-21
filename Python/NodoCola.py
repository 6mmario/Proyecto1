class nodeCola:
    def __init__(self, nombre = None, elementCancion = None, next = None, prev = None):
        self.nombre = nombre
        self.elementCancion = elementCancion
        self.next = next
        self.prev = prev

    def __str__(self):
        return "%s %s" %(self.nombre)