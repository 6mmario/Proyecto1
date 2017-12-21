from NodoBinario import nBinary

class aBinary:
    def __init__(self):
        self.root = None

    def insert(self, element):
        if self.root == None:
            self.root = element
        else:
            aux = self.root
            father = None
            while aux!= None:
                father = aux
                if int(element.id) >= int(aux.id):
                    aux = aux.right
                else:
                    aux = aux.left
            if int(element.id) >= int(father.id):
                father.right = element
            else:
                father.left = element

    def delete(self,elemento):
        temp = self.root




    def preOrder(self, elemento):
        if (elemento != None):
            print (elemento)
            self.preOrder(elemento.left)
            self.preOrder(elemento.right)

    def postOrder(self, elemento):
        if (elemento != None):
            self.postOrder(elemento.left)
            self.postOrder(elemento.right)
            print(elemento)

    def inOrder(self, elemento):
        if (elemento != None):
            self.inOrder(elemento.left)
            print(elemento)
            self.inOrder(elemento.right)

    def getRoot(self):
        if(self.root != None):
            return self.root

