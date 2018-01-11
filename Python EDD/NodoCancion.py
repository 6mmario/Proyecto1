class nodeCancion:
    def __init__(self,nombre=None, path=None, next=None, prev=None):
        self.nombre = nombre
        self.path = path
        self.next = next
        self.prev = prev

    def __str__(self):
        return "*%s*%s" %(self.nombre, self.path)