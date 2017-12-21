from flask import Flask, request, Response
from arbolBinario import aBinary
from ListaCircular import listaCircular
from NodoCircular import nodeCircular

lista = listaCircular()

app = Flask("Proyecto1")

@app.route('/agregarLista', methods=['POST'])
def agregarLista():
        parametro = str(request.form['dato'])
        parametro2 = str(request.form['dato1'])
        node = nodeCircular(parametro,parametro2)
        lista.insert(node)
        lista.graficar()
        return "Dato Agregado a Lista_Simple " + str(parametro) +' '+ str(parametro2) + "! \n"













if __name__ == "__main__":
    app.run(debug=True, host='0.0.0.0')