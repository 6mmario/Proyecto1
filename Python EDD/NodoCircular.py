class nodeCircular:
    def __init__(self,nombre = None, pasword = None, next = None, prev = None, accesoCola = None):
        self.nombre = nombre
        self.pasword = pasword
        self.next = next
        self.prev = prev
        self.accesoCola = accesoCola

    def __str__(self):
        return "%s %s" %(self.nombre, self.pasword)