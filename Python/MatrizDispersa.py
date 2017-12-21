from graphviz import Digraph

class Nodo:

    def __init__(self,ao,genero,date,nodo):
        self.ao     = ao
        self.genero      = genero
        self.date     = date
        self.nodo    = nodo
        self.siguiente = None
        self.atras     = None
        self.arriba    = None
        self.abajo     = None

class MatrizDispersa:

    def __init__(self):
        self.principal = Nodo("i",0,0,0)
        self.contador = 1
        self.contador2= 0
        self.contador3 =3
        self.contador4 =4
        self.contador5 =5
        self.ranksame = ""


    def EsVacio1(self):
        return self.principal.siguiente == None

    def EsVacio2(self):
        return self.principal.abajo     == None


    def Insertar(self,ao, genero, date):

        self.contador  +=100
        self.contador2 +=400
        if not self.BuscarEmpresa(genero):
            nuevo = Nodo(ao, genero, date, self.contador)
            if self.EsVacio1():
                 self.principal.siguiente = nuevo
            else:
                if  self.principal.siguiente.genero  > genero:
                    nuevo.siguiente = self.principal.siguiente
                    self.principal.siguiente = nuevo
                else:
                    anterior = self.principal.siguiente
                    while anterior.siguiente and anterior.siguiente.genero <= genero:
                        anterior = anterior.siguiente
                    nuevo.siguiente = anterior.siguiente
                    anterior.siguiente = nuevo

        if not self.BuscarDep(ao):
            nuevo = Nodo(ao, genero, date, self.contador2)
            if self.EsVacio2():
                self.principal.abajo = nuevo
            else:
                 if  self.principal.abajo.ao  > ao:
                     nuevo.abajo = self.principal.abajo
                     self.principal.abajo = nuevo
                 else:
                    anterior = self.principal.abajo
                    while anterior.abajo and  anterior.abajo.ao <= ao:
                        anterior = anterior.abajo
                    nuevo.abajo = anterior.abajo
                    anterior.abajo = nuevo

        if not self.FechaExistente(ao,genero,date):
           self.NodoInterno(ao,genero,date)


    def NodoInterno(self,ao,genero,date):

        if not self.Profundidad(ao,genero,date):

                self.contador3 +=600
                nuevo = Nodo(ao,genero,date,self.contador3)

                aux = self.principal.siguiente
                while aux!=None:
                  if aux.genero == genero:
                         if aux.abajo ==None:
                             aux.abajo = nuevo
                             break
                         else:
                             if  aux.abajo.ao > ao:
                                 nuevo.abajo = aux.abajo
                                 aux.abajo = nuevo
                                 break
                             else:
                                 anterior = aux.abajo
                                 while anterior.abajo and anterior.abajo.ao <= ao :
                                     anterior = anterior.abajo
                                 nuevo.abajo = anterior.abajo
                                 anterior.abajo = nuevo

                  aux = aux.siguiente


                aux2 = self.principal.abajo
                while aux2!=None:
                    if  aux2.ao == ao:
                        if aux2.siguiente == None:
                            aux2.siguiente = nuevo
                            break
                        else:

                            if  aux2.siguiente.genero  > genero:
                                nuevo.siguiente = aux2.siguiente
                                aux2.siguiente = nuevo
                                break
                            else:
                                anterior = aux2.siguiente
                                while anterior.siguiente and anterior.siguiente.genero  <= genero:
                                    anterior = anterior.siguiente
                                nuevo.siguiente = anterior.siguiente
                                anterior.siguiente = nuevo
                    aux2 = aux2.abajo



    def Profundidad(self,ao,genero,date):
       self.contador5 +=2000
       nuevo = Nodo(ao,genero,date,self.contador5)
       aux = self.principal.siguiente
       while aux!=None:
           if aux.genero == genero:
              temp = aux.abajo
              while temp!=None:
                 if temp.ao == ao and temp.genero==genero:

                            if temp.date > date:
                               newday = temp.date
                               temp.date = date
                               new = Nodo(ao, genero, newday, self.contador5)

                               if  temp.siguiente == None:
                                   temp.siguiente = new
                                   return  True
                               else:

                                   if temp.siguiente.date > newday:
                                       new.siguiente = temp.siguiente
                                       temp.siguiente = new
                                       return True
                                   else:
                                       anterior = temp.siguiente
                                       while anterior.siguiente and anterior.siguiente.date <= date:
                                           anterior = anterior.siguiente
                                       new.siguiente = anterior.siguiente
                                       anterior.siguiente = new
                                       return  True

                            else:
                                if temp.siguiente == None:
                                    temp.siguiente = nuevo
                                    return True
                                else:

                                    if  temp.siguiente.date > date:
                                        nuevo.siguiente = temp.siguiente
                                        temp.siguiente = nuevo
                                        return True
                                    else:
                                        anterior = temp.siguiente
                                        while anterior.siguiente and anterior.siguiente.date <= date:
                                            anterior = anterior.siguiente
                                        nuevo.siguiente = anterior.siguiente
                                        anterior.siguiente = nuevo
                                        return True


                 temp = temp.abajo
           aux = aux.siguiente
       return  False


    def FechaExistente(self, ao,genero,date):
        aux = self.principal.siguiente
        while aux!=None:
            if aux.genero == genero:
               temp = aux.abajo
               while temp!=None:
                   if temp.ao == ao and temp.genero == genero:
                       dates = temp
                       while dates!=None:
                          if dates.date == date:
                            return  True
                          dates = dates.siguiente
                   temp = temp.siguiente
            aux = aux.siguiente
        return False

    def Recorridox(self):
        print "Cabecera: x"
        aux = self.principal.siguiente
        while aux.siguiente != None:
            print  str(aux.genero) + "->" + str(aux.siguiente.genero)
            aux = aux.siguiente



    def Recorridoy(self):
        print "Cabecera: y"
        aux = self.principal.abajo
        while aux.abajo!= None:
            print  str(aux.ao) + "->"+ str(aux.abajo.ao)
            aux = aux.abajo

    def BuscarEmpresa(self, empresa):
        aux = self.principal.siguiente
        while aux!=None:
          if aux.genero == empresa:
              return  True
          aux = aux.siguiente
        return  False


    def BuscarDep(self, depar):
        aux = self.principal.abajo
        while aux!=None:
          if aux.ao == depar :
              return  True
          aux = aux.abajo
        return  False



    def RecorrePorColumna(self):
        print "recorrer por columnas"
        aux = self.principal.siguiente
        while aux!=None:
            print str(aux.genero) + "->" + str(aux.abajo.date)
            temp = aux.abajo
            while temp.abajo!=None:
                print str(temp.date) +"->"+str(temp.abajo.date)
                temp = temp.abajo
            print "........................."
            aux = aux.siguiente

    #funcion que recorre por filas
    def RecorrerPorFila(self):
        print "Reccorrer por filas"
        aux = self.principal.abajo
        while aux!=None:
            print  str (aux.ao)+"->"+str(aux.siguiente.date)
            temp = aux.siguiente
            while temp.siguiente!=None:
                print str(temp.date)+"->"+str(temp.siguiente.date)
                temp = temp.siguiente
            print "........................."
            aux = aux.abajo




    def Grafica(self):
         g = Digraph('G', filename='Matriz.txt')
         g.body.append('rankdir=LR')
         g.attr('node', shape='box',style='filled, rounded', width='1.1', height="1,1",  fillcolor = 'azure1', color = 'blue')
         g.body.append('subgraph cluster_0 {')
         g.body.append('label = "Reporte Matriz"')

         aux = self.principal
         while aux!= None:
             g.body.append('nodo' + str(aux.nodo)+ '[label = "' + str(aux.genero) + '"]')
             temp = aux.abajo
             while temp !=None:
                 g.body.append('nodo' + str(temp.nodo)+'[fillcolor=deepskyblue, label = "' + str(temp.ao)   +'"]' )
                 temp = temp.abajo
             break

         fila = self.principal.abajo
         while fila!=None:
              g.body.append('nodo' + str(fila.nodo) + '[fillcolor=deepskyblue,  label = "' + str(fila.ao) + '"]')
              temp = fila.siguiente
              while temp !=None:
                  g.body.append('nodo' + str(temp.nodo) + '[label = "' + str(temp.date) + '"]')
                  temp = temp.siguiente
              fila = fila.abajo


         aux1 = self.principal.siguiente
         while aux1 != None:
                 g.body.append('nodo' + str(aux1.nodo) + '[fillcolor=deepskyblue,  label = "' + str(aux1.genero) + '"]')
                 temp = aux1.abajo
                 while temp != None:
                     g.body.append('nodo' + str(temp.nodo) + '[label = "' + str(temp.date) + '"]')
                     temp = temp.abajo
                 aux1 = aux1.siguiente


         #columnas
         aux2 = self.principal
         while aux2 != None:
             g.body.append('nodo' + str(aux2.nodo) + " ->" + "nodo" + str(aux2.abajo.nodo)+'[constraint=false, dir="both"]')
           #  g.body.append('nodo' + str(aux2.abajo.nodo) + "->" + "nodo" + str(aux2.nodo)+'')
             temp = aux2.abajo
             while temp.abajo != None:

                 g.body.append('nodo' + str(temp.nodo) + " ->" + "nodo" + str(temp.abajo.nodo)+'[constraint=false, dir="both"]')
                # g.body.append('nodo' + str(temp.abajo.nodo) + "->" + "nodo" + str(temp.nodo)+'')
                 temp = temp.abajo
             aux2 = aux2.siguiente


         #filas
         aux3 = self.principal
         while aux3 != None:
                g.body.append('nodo' + str(aux3.nodo) + "->" + "nodo" + str(aux3.siguiente.nodo) +'[dir="both"]')
            #   g.body.append('nodo' + str(aux3.siguiente.nodo) + "->" + "nodo" + str(aux3.nodo) + '[constraint=false]')
                temp = aux3.siguiente
                while temp.siguiente != None:

                    g.body.append('nodo' + str(temp.nodo) + "->" + "nodo" + str(temp.siguiente.nodo) + '[dir="both"]')
            #       g.body.append('nodo' + str(temp.siguiente.nodo) + "->" + "nodo" + str(temp.nodo) + '[constraint=false]')
                    temp = temp.siguiente
                aux3 = aux3.abajo

         aux4 = self.principal
         while aux4 != None:
             self.ranksame +=" nodo"+str(aux4.nodo)
             temp = aux.abajo
             while temp != None:
                 self.ranksame += " nodo"+str(temp.nodo)
                 temp = temp.abajo
             break

         g.body.append('{rank=same '+self.ranksame+'}')
         self.ranksame =""
         aux5 = self.principal.siguiente
         while aux5 != None:
             self.ranksame += " nodo" + str(aux5.nodo)
             temp = aux5.abajo
             while temp != None:
                 self.ranksame += " nodo" + str(temp.nodo)
                 temp = temp.abajo
             g.body.append('{rank=same ' + self.ranksame + '}')
             self.ranksame = ""
             aux5 = aux5.siguiente
         self.ranksame =""

         g.body.append('}')
         g.format= "png"
         g.view()
