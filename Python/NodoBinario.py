class nBinary:

    def __init__(self, id = None, left=None , right= None):
        self.id = id
        self.left = left
        self.right = right

    def __str__(self):
        return "%d" %(self.id)