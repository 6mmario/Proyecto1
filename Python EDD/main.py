from flask import Flask, request, Response
from arbolBinario import aBinary
from ListaCircular import listaCircular
from NodoCircular import nodeCircular
from MatrizDispersa import MatrizDispersa

lista = listaCircular()
Matriz = MatrizDispersa()

app = Flask("Proyecto1")


@app.route('/insert', methods=['POST'])
def addListaDoble():
    parametro = str(request.form['user'])
    parametro2 = str(request.form['pass'])
    node = nodeCircular(parametro, parametro2)
    lista.insert(node)
    return "Dato Agregado a Lista_Simple " + str(parametro) + ' ' + str(parametro2) + "! \n"


@app.route('/search', methods=['POST'])
def searchListaDoble():
    parametro = str(request.form['user'])
    parametro2 = str(request.form['pass'])
    node = lista.search(parametro, parametro2)
    if node == None:
        return ("False")
    else:
        return ("True")


@app.route('/insertarMatrix', methods=['POST'])
def insertMatrix():
    parametro = str(request.form['anio'])
    parametro2 = str(request.form['Genero'])
    parametro3 = str(request.form['nodo'])
    Matriz.Insertar(parametro, parametro2, parametro3)
    Matriz.Grafica()
    return "Datos agregados"


if __name__ == "__main__":
    app.run(debug=True, host='0.0.0.0')
