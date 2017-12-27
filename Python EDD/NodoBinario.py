class nBinary:

    def __init__(self, id = None, left=None , right= None, acceso = None):
        self.id = id
        self.left = left
        self.right = right
        self.acceso = acceso

    def __str__(self):
        return "%s" %(self.id)