class NodeTree:
    def __init__(self,nombreArtista = None, next = None, prev = None, accesoBinario = None):
        self.nombreArtista = nombreArtista
        self.next = next
        self.prev = prev
        self.accesoBinario = accesoBinario

    def __str__(self):
        return "%s" %(self.nombreArtista)