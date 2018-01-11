#!/usr/bin/python
# -*- coding: utf-8 -*-
import os
from werkzeug.contrib.fixers import ProxyFix
from flask_dance.contrib.google import make_google_blueprint, google
from flask import Flask, request, Response, redirect, url_for
# from raven.contrib.flask import Sentry
from ListaCircular import listaCircular
from NodoCircular import nodeCircular
from MatrizDispersa import MatrizDispersa
from NodoCancion import nodeCancion
from Matriz import matriz
from NodoCola import nodeCola
from ColaCircular import colaCircular

lista = listaCircular()
Matriz = MatrizDispersa()
matriz = matriz()

app = Flask("Proyecto1")
app.secret_key = "supersekrit"
blueprint = make_google_blueprint(
    client_id="68862438233-2rs8qseov1651g99tjibeo0e3pr4491u.apps.googleusercontent.com",
    client_secret="8rB4EKc8mbJHE9c7JswJuuD2",
    scope=["profile", "email"]
)
app.register_blueprint(blueprint, url_prefix="/login")

@app.route("/")
def index():
    if not google.authorized:
        return redirect(url_for("google.login"))
    resp = google.get("/oauth2/v2/userinfo")
    assert resp.ok, resp.text
    return "You are {email} on Google".format(email=resp.json()["email"])


###########################################################################################
#               Insertar en las Estructuras                                               #
###########################################################################################
# inserta en la Lista doble de Usuarios
@app.route('/insert', methods=['POST'])
def addListaDoble():
    parametro = str(request.form['user'])
    parametro2 = str(request.form['pass'])
    node = nodeCircular(parametro, parametro2)
    lista.insert(node)
    return "Dato Agregado a Lista_Simple " + str(parametro) + ' ' + str(parametro2) + "! \n"


# Busca en la lista doble de Usuarios
@app.route('/search', methods=['POST'])
def searchListaDoble():
    parametro = str(request.form['user'])
    parametro2 = str(request.form['pass'])
    node = lista.search(parametro, parametro2)
    if node == None:
        return ("False")
    else:
        return ("True")


# insertar en la Matriz
@app.route('/insertarMatrix', methods=['POST'])
def insertMatrix():
    parametro = str(request.form['anio'])
    parametro2 = str(request.form['Genero'])
    parametro3 = str(request.form['nodo'])
    # Matriz.Insertar(parametro, parametro2, parametro3)
    matriz.add(parametro, parametro2, parametro3)
    return "Datos agregados \n"


# Insertar Artistas
@app.route('/insertarArtista', methods=['POST'])
def insertarArtistas():
    parametro = str(request.form['elementMatriz'])  # nodo de la matriz
    parametro1 = str(request.form['elementB'])  # nombre del artista
    # aux = Matriz.buscarColumnas(parametro)
    aux = matriz.buscar(parametro)
    if aux != None:
        matriz.insertB(aux, parametro1)
        return 'datos agregados \n'
    return 'False'


# insertar Albums
@app.route('/insertarAlbum', methods=['POST'])
def insertarAlbum():
    parametro = str(request.form['elementB'])  # nodo del BBT
    parametro2 = str(request.form['elementBBT'])  # nodo a insertar al ABB
    parametro3 = str(request.form['elementMatriz'])
    nodoMatriz = matriz.buscar(parametro3)  # Busco el Nodo de la Matriz
    if nodoMatriz != None:  # si el nodo existe
        larbolB = nodoMatriz.accesB  # asigno el Arbl B
        if (larbolB != None):  # si el arbol B existe
            nodoB = larbolB.searchArtista(parametro)  # busco el Nodo que pertenece al Artista
            if nodoB != None:  # si el nodo existe
                larbolB.insertarBinario(nodoB, parametro2)
                return 'Agregado Albumes'
        return 'FalseArbolB'
    return 'FalseMatriz'


@app.route('/insertarCanciones', methods=['POST'])
def insertarCanciones():
    parametro = str(request.form['nodoMatriz'])  # nodo Matriz
    parametro1 = str(request.form['NodoB'])  # nodo BTree
    parametro2 = str(request.form['NodoBB'])  # nodo ABB
    parametro3 = str(request.form['nombreCancion']).encode('utf-8').strip()  # nodo Nombre Canciones
    parametro4 = request.form['path'].encode('utf-8').strip()  # nodo Path
    # print parametro4
    nodoMatriz = matriz.buscar(parametro)  # Busco el Nodo de la Matriz
    if nodoMatriz != None:  # si el nodo existe
        larbolB = nodoMatriz.accesB  # asigno el Arbl B
        if (larbolB != None):  # si el arbol B existe
            nodoB = larbolB.searchArtista(parametro1)  # busco el Nodo que pertenece al Artista
            if nodoB != None:  # si el nodoB existe ahora asigno
                abb = nodoB.accesoBinario  # asigno la lista
                nodoBB = abb.getRoot()  # asigno la raiz a un nodo ABB
                nodoBB = abb.search(parametro2, nodoBB)  # busco un nodo en el ABB
                if (nodoBB != None):  # existe el Nodo en el ABB
                    nodo = nodeCancion(parametro3, parametro4)
                    abb.insertListaCircular(nodoBB, nodo)
                    return 'True'
                return 'FalseABB'
            return 'FalseB'
        return 'FalseArbolB'
    return 'FalseMatriz'


# Insertar Canciones a una PlayList
@app.route('/addlista', methods=['POST'])
def insertarPlayList():
    parametro = str(request.form['usuario'])  # nombre del usuario
    parametro1 = str(request.form['password'])  # contrase;a del usuario
    # adicional a esto
    parametro4 = str(request.form['anio'])  # anio
    parametro7 = str(request.form['genero'])
    parametro5 = str(request.form['nodoB'])  # artista
    parametro6 = str(request.form['nodoBinario'])  # album
    parametro2 = str(request.form['nombreCancion']).encode('utf-8').strip()
    parametro3 = request.form['path'].encode('utf-8').strip()
    aux = lista.search(parametro, parametro1)

    if (aux != None):
        nodo = nodeCola(parametro4, parametro7, parametro5, parametro6, parametro2, parametro3)
        lista.insertColaCanciones(aux, nodo)
        # nodoCancion = matriz.apuntarCanciones(parametro4, parametro7, parametro5, parametro6, parametro2, parametro3)
        # nodo.elementCancion = matriz.apuntarCanciones(parametro4, parametro7, parametro5, parametro6, parametro2, parametro3)

        # obtengo el valor del nodo de las estructuras


        return 'Insertado con Exito'
    return 'False'


# Insertar Nuevas Canciones
@app.route('/nuevasCanciones', methods=['POST'])
def nuevasCanciones():
    parametro = str(request.form['cadenaz'])
    texto = matriz.todasCanciones()
    return texto


###########################################################################################
#               Listas de Reproduccion                                                    #
###########################################################################################
# Reproducir Canciones a una PlayList
@app.route('/reproducirPlayList', methods=['POST'])
def PlayList():
    parametro = str(request.form['usuario'])  # nombre del usuario
    parametro1 = str(request.form['password'])  # contrase;a del usuario
    aux = lista.search(parametro, parametro1)
    if (aux != None):
        temp = aux.accesoCola
        if (temp != None):
            text = lista.recorrerColaCancion(temp)
            verify()
            return text
    return 'False'


# reproducr las canciones de un album
@app.route('/searchABB', methods=['POST'])
def ReproduciAlbum():
    parametro = str(request.form['album'])
    texto = matriz.buscarAlbum2(parametro)
    if texto == None:
        return ("False")
    else:
        return texto


# reproducir todo un Genero
@app.route('/todoGenero', methods=['POST'])
def todoGenero():
    parametro = str(request.form['genero'])
    texto = matriz.recorrerColumasCanciones(parametro)  # hago una busqueda a la matriz por columnas
    if texto != 'False':
        return texto
    else:
        return 'False'


# reproducir todas las canciones de un artista
@app.route('/todoArtista', methods=['POST'])
def todoArtista():
    parametro = str(request.form['artista'])
    texto = matriz.recorrerArtistasCanciones(parametro)
    if texto != 'False':
        return texto
    else:
        return 'False'


# reproduccion de todo un a;o
@app.route('/todoAnio', methods=['POST'])
def todoAnio():
    parametro = str(request.form['anio'])
    texto = matriz.generarporAnio(parametro)
    if texto != 'False':
        return texto
    else:
        return 'False'


###########################################################################################
#               Eliminacion                                                               #
###########################################################################################
# Eliminar Usuario
@app.route('/eliminarUsuario', methods=['POST'])
def eliminarUsurio():
    parametro = str(request.form['usuario'])  # nombre del usuario
    parametro1 = str(request.form['password'])  # contrase;a del usuario
    nodo = lista.search(parametro, parametro1)
    lista.delete(nodo)
    return 'yo digo que lo elimine'


@app.route('/eliminarCancion', methods=['POST'])
def eliminarCancion():
    parametro1 = str(request.form['anio'])  # anio
    parametro2 = str(request.form['genero'])
    parametro3 = str(request.form['artista'])  # artista
    parametro4 = str(request.form['album'])  # album
    parametro5 = str(request.form['nombreCancion']).encode('utf-8').strip()
    parametro6 = request.form['path'].encode('utf-8').strip()
    matriz.eliminarCanciones(parametro1, parametro2, parametro3, parametro4, parametro5, parametro6)
    lista.eliminarCanciones(parametro1, parametro2, parametro3, parametro4, parametro5, parametro6)
    texto = matriz.todasCanciones()
    return texto


# def eliminarCancionesPlayList(parametro1,parametro2, parametro3, parametro4, parametro5, parametro6):
#     lista.eliminarCanciones(parametro1,parametro2, parametro3, parametro4, parametro5, parametro6)
#
def verify():
    aux = lista.first
    if (aux != None):
        while True:
            temp = aux.accesoCola
            if (temp != None):
                aux1 = temp.front
                while True:
                    encontrado = matriz.buscarCanciones(aux1.anio, aux1.genero, aux1.nodoB, aux1.nodoABB, aux1.nombre, aux1.path)
                    if(encontrado == None):#existe todav[ia la cancion
                        print 'debo eliminar esta cancion: ' +str(aux1)
                        temp.buscarCanciones1(aux1.anio, aux1.genero, aux1.nodoB, aux1.nodoABB, aux1.nombre, aux1.path)
                    aux1 = aux1.next
                    if(aux1 == temp.front):
                        break
            aux = aux.next
            if (aux == lista.first):
                break


@app.route('/eliminarArtista', methods=['POST'])
def eliminarArtista():

    parametro1 = str(request.form['anio'])  # anio
    parametro2 = str(request.form['genero'])
    parametro3 = str(request.form['artista'])  # artista

    estado = matriz.buscarArtista(parametro1 + '-' + parametro2, parametro3)
    if (estado == True):
        texto = matriz.todasCanciones()

        return texto
    else:
        return 'False'


# eliminar nodo matriz
@app.route('/eliminarNodoMatriz', methods=['POST'])
def eliminarNodoMatriz():
    parametro1 = str(request.form['anio'])  # anio
    parametro2 = str(request.form['genero'])

    estado = matriz.buscar(parametro1 + '-' + parametro2)
    if (estado != None):
        matriz.eliminarFila(parametro1, parametro2)
        matriz.eliminarColumna(parametro1, parametro2)
        texto = matriz.todasCanciones()
        verify()
        return texto
    else:
        return 'False'


###########################################################################################
#               Graficas de las Estructuras                                               #
###########################################################################################

# Abre la grafica de Usuarios
@app.route('/graph', methods=['POST'])
def graphLista():
    lista.graficar()
    return 'Grafia Realizada de la Lista de Usuarios \n'


# Abre la grafica de la Matriz
@app.route('/graphMatrix', methods=['POST'])
def graphMatriz():
    # Matriz.Grafica()
    matriz.graficar()
    return 'Grafia Realizada de la Matriz \n'


# Abre la Grafica de Artistas por consola
@app.route('/graphBArtista', methods=['POST'])
def graphB():
    parametro = str(request.form['nodoMatriz'])  # nodo de la matriz
    aux = matriz.buscar(parametro)
    if (aux != None):
        matriz.recorrerB(aux.accesoB)
        return 'true'
    return 'false'


# abre la grafica de Albums del Artista /graphABBAlbum
@app.route('/graphABBAlbum', methods=['POST'])
def graphABB():
    parametro = str(request.form['elementB'])
    parametro1 = str(request.form['elementMatriz'])
    nodoMatriz = matriz.buscar(parametro1)
    if nodoMatriz != None:  # si encuentro el Nodo
        larbolB = nodoMatriz.accesB  # obtengo la Lista del BTree
        if larbolB != None:  # si en el nodo de la matriz existe un arbol B
            nodoB = larbolB.searchArtista(parametro)  # busco dentro del arbol B
            if nodoB != None:  # encuentro el nodo del arbol B
                abb = nodoB.accesoBinario  # asigno a una variable el ABB
                if (abb != None):  # si existe el arbol
                    larbolB.recorrerABB(abb, nodoB.nombreArtista)
                    return 'True'
            return 'FalseBInario'
        return 'FalseBTREE'
    return 'FalseMatriz'


@app.route('/graphListaCanciones', methods=['POST'])
def graphlistaCanciones():
    parametro = str(request.form['album'])
    matriz.buscarAlbum(parametro)
    return 'False'


@app.route('/graphPlayList', methods=['POST'])
def graficarPlayList():
    parametro = str(request.form['usuario'])  # nombre del usuario
    parametro1 = str(request.form['password'])  # contrase;a del usuario

    aux = lista.search(parametro, parametro1)
    if (aux != None):
        temp = aux.accesoCola
        if (temp != None):
            temp.graficar(parametro)
            return 'Grafica Terminada'
    return 'False'


if __name__ == "__main__":
    app.run(debug=True, host='localhost', port=5000)
