#!/usr/bin/python
# -*- coding: utf-8 -*-
from __future__ import unicode_literals

from graphviz import Digraph


class listaCircularCanciones:
    def __init__(self):
        self.first = None
        self.last = None

    def insertar(self, element):
        if self.first == None:
            self.first = element
            self.last = element
            self.last.next = self.first
            self.first.prev = self.last
        else:
            self.last.next = element
            element.prev = self.last
            self.last = element
            self.last.next = self.first
            self.first.prev = self.last

    texto = ''
    def Canciones(self):
        self.texto = ''
        aux = self.first
        if (aux != None):
            while True:
                self.texto +='*'+aux.nombre.decode("utf8")
                self.texto +='*'+aux.path.decode("utf8")
                aux = aux.next
                if (aux == self.first):
                    break
        return self.texto


    def searchCancion(self, nombre, path):
        aux = self.first
        if (aux != None):
            while True:
                if (aux.nombre == nombre and aux.path == path):
                    return aux
                aux = aux.next
                if (aux == self.first):
                    break
        return None

    def deleteCancion(self, element):
        if element == self.first == self.last:
            self.first = None
            self.last = None
        elif element == self.first:
            self.first = self.first.next
            self.first.prev = self.last
            self.last.next = self.first
        elif element == self.last:
            self.last = self.last.prev
            self.last.next = self.first
            self.first.prev = self.last
        else:
            aux = self.first
            while (aux.next != self.first):
                if (aux == element):
                    aux.prev.next = aux.next
                    aux.next.prev = aux.prev
                aux = aux.next

    def graficarListaCanciones(self, album):
        g = Digraph('G', filename='CircularCanciones.gv')
        g.body.append('rankdir=UD')
        g.attr('node', shape='box', color='blue')
        aux = self.first
        if aux == None:
            g.edge(str('LISTA VACIA'))
        else:
            while True:
                g.body.append('"' + aux.nombre.decode("utf8") + ' \\n ' + aux.path.decode(
                    "utf8") + '"' + '->' + '"' + aux.next.nombre.decode("utf8") + ' \\n ' + aux.next.path.decode(
                    "utf8") + '" [dir=both arrowhead=invodot color=yellow]')
                # g.body.append('"'+aux.nombre.encode('utf-8')+'"'+'->'+'"'+aux.next.nombre.encode('utf-8')+'"')
                # g.body.append(aux.path.decode("utf8"))
                # print aux.nombre + '->' + aux.next.nombre
                aux = aux.next
                if (aux == self.first):
                    break
            g.body.append('label = "Lista de Canciones del Album: ' + str(album) + ' del Artista: "')
        g.format = 'png'
        g.render('test-output/Lista-Canciones/CircularCanciones.gv', view=True)

    text = ""

    def recorrerLista(self):
        self.text += "style=filled; \n color=lightgrey; \n node [style=filled,color=white]; \n"
        aux = self.first
        if (aux == None):
            self.text += "No Tiene Canciones Este Album"
        else:
            while True:
                self.text += str(aux.nombre) + "->" + str(aux.next.nombre) + "[dir = both constraint= false] \n"
                aux = aux.next
                if (aux == self.first):
                    self.text += "label = \"Lista de Canciones\"; \n"
                    return self.text
