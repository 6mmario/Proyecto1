package proyectoedd;

import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import javax.swing.JOptionPane;


public class Conection {
    

    static String cadena;
   // static String cadenaP;
    //static String cadenaAlbum;
   // static String cadenaGenero;
 //   static String cadenaGeneral;
    public static OkHttpClient webClient = new OkHttpClient();

    public Conection() {
     
    }



    //Inserto en la lista de Usuarios
    public void insert(String nombre, String Pasword) {
        RequestBody formBody = new FormEncodingBuilder()
                .add("user", nombre)
                .add("pass", Pasword)
                .build();
        String r = getString("insert", formBody);
        System.out.println(r + "\n--- Metodo Agregar Usuarios");
    
    }

    //Grafico la LIsta de Usuarios
    public void grafica(String lista) {
        RequestBody formBody = new FormEncodingBuilder()
                .add("algo", lista)
                .build();
        String r = getString("graph", formBody);
        System.out.println(r + "\n---Grafica Realizada");
    }

    //Grafica la Matriz
    public void graficaMatriz() {
      //  RequestBody formBody = new FormEncodingBuilder()
        //   .build();
        String r = getString("graphMatrix", null);
        System.out.println(r + "\n---Grafica Realizada");
    }

    //Busca Usuarios en la LIsta
    public boolean search(String nombre, String Pasword) {
        RequestBody formBody = new FormEncodingBuilder()
                .add("user", nombre)
                .add("pass", Pasword)
                .build();
        String r = getString("search", formBody);
        System.out.println(r + "---Retorno esto: \n");
        if (r.equals("True")) {
            return true;
        }
        return false;
    }

    public void addlista(String usuario, String password, String anio, String genero, String album, String artista, String nombreCancion, String path) {
        RequestBody formBody = new FormEncodingBuilder()
                .add("usuario", usuario)
                .add("password", password)
                .add("nombreCancion", nombreCancion)
                .add("path", path)
                .add("anio", anio)
                .add("genero", genero)
                .add("nodoB", artista)
                .add("nodoBinario", album)
                .build();
        String r = getString("addlista", formBody);
        System.out.println(r + "\n--- Metodo Agregar PlayList");
    }


    public boolean reproducirPlayList(String usuario, String password) {
        RequestBody formBody = new FormEncodingBuilder()
                .add("usuario", usuario)
                .add("password", password)
                .build();
        cadena = getString("reproducirPlayList", formBody);
        System.out.println(cadena + "\n--- play list esto retorna");
        return !cadena.equals("False");

    }
        public boolean eliminaNodoArtista(String anio, String genero, String artista) {
        RequestBody formBody = new FormEncodingBuilder()
                .add("anio", anio)
                .add("genero", genero)
                .add("artista", artista)
                .build();
        cadena = getString("eliminarArtista", formBody);
        System.out.println(cadena + "\n--- ELIMINAR NODO ARTISTA ESTO RETORNA");
        return !cadena.equals("False");

    }
   public void listaGeneral(String cadenaz) {
        RequestBody formBody = new FormEncodingBuilder()
                .add("cadenaz", cadenaz)
                .build();
        cadena = getString("nuevasCanciones", formBody);
        System.out.println(cadena + "\n---listado general de canciones");

    }
     
  public void eliminarUsuario(String usuario, String password){
    RequestBody formBoby = new FormEncodingBuilder()
                .add("usuario", usuario)
                .add("password", password)
                .build();
           String r = getString("eliminarUsuario", formBoby);
            System.out.println(r + "---ELIMINADO CORRECTAMENTE \n");

    }
  
  //Busqueda de album por nombre
  public boolean searchAlbum(String album){
   RequestBody formBoby = new FormEncodingBuilder()
                .add("album", album)
                .build();
   cadena = getString("searchABB", formBoby);
      System.out.println(cadena + "---BUSQUEDA COMPLETA \n");
        return !cadena.equals("False");
       }
  //Busqueda de genero
    public boolean searchGenero(String genero){
   RequestBody formBoby = new FormEncodingBuilder()
                .add("genero",genero)
                .build();
   cadena = getString("todoGenero", formBoby);
   System.out.println(cadena + "---BUSQUEDA COMPLETA \n");
        return !cadena.equals("False");
  }
  
      public boolean searchArtista(String artista){
   RequestBody formBoby = new FormEncodingBuilder()
                .add("artista",artista)
                .build();
   cadena = getString("todoArtista", formBoby);
      System.out.println(cadena + "---BUSQUEDA COMPLETA \n");
      return !cadena.equals("False");
  }
      
    //graficar playlist
    public void graphplaylist(String usuario, String password) {
        RequestBody formBoby = new FormEncodingBuilder()
                .add("usuario", usuario)
                .add("password", password)
                .build();
        String r = getString("graphPlayList", formBoby);
        if (r.equals("False")) {
            JOptionPane.showMessageDialog(null, "No tiene una PlayList creada");
        }
        System.out.println(r + "---Si todo Esta bien, me mostrara la grafica \n");

    }

    //Inserto datos a la Matriz
    public void insertMatrix(String anio, String Genero, String nodo) {
        RequestBody formBody = new FormEncodingBuilder()
                .add("anio", anio)
                .add("Genero", Genero)
                .add("nodo", nodo)
                .build();
        String r = getString("insertarMatrix", formBody);
        System.out.println(r + "---Esto Retorne \n");
    }

    //Inserto datos al Arbol B de Artistas
    public void insertarArtist(String nodoMatriz, String NodoB) {
        RequestBody formBody = new FormEncodingBuilder()
                .add("elementMatriz", nodoMatriz)
                .add("elementB", NodoB)
                .build();
        String r = getString("insertarArtista", formBody);
        System.out.println(r + "---Si todo esta bien, ya lo inserte: \n ");
    }

    //Grafica del Arbol B
    public void graphBARtista(String nodoMatriz) {
        RequestBody formBoby = new FormEncodingBuilder()
                .add("nodoMatriz", nodoMatriz)
                .build();
        String r = getString("graphBArtista", formBoby);
        if (r.equals("false")) {
            JOptionPane.showMessageDialog(null, "No Existen Artiestas para esta Peticion");
        }
        System.out.println(r + "---Si todo Esta bien, me mostrara la grafica \n");
    }

    //Inserto datos al arbol binario de busqueda Nombre artista + nombre Album + nodo (genero y anio)
    public void insertarAlbums(String elementB, String elementABB, String nodoMatriz) {
        RequestBody formBoby = new FormEncodingBuilder()
                .add("elementB", elementB)
                .add("elementBBT", elementABB)
                .add("elementMatriz", nodoMatriz)
                .build();
        String r = getString("insertarAlbum", formBoby);
        System.out.println(r + "---Estado del Ingreso del Album: \n");
    }

    //muestro la Grafica
    public void graphABBAlbums(String elementB, String nodoMatriz) {
        RequestBody formBoby = new FormEncodingBuilder()
                .add("elementB", elementB)
                .add("elementMatriz", nodoMatriz)
                .build();
        String r = getString("graphABBAlbum", formBoby);
        System.out.println(r + "---Estado De la Grafica de Albums: \n");
         if (r.equals("FalseBInario")||r.equals("FalseBTREE")||r.equals("FalseMatriz")) {
            JOptionPane.showMessageDialog(null, "No Existen Albumes para esta Peticion");
        }
        System.out.println(r + "---Si todo Esta bien, me mostrara la grafica \n");
    }

    //iinserto Canciones
    public void insertarCanciones(String nodoMatriz, String NodoB, String nodoBB, String nombreCancion, String path) {
        RequestBody formBoby = new FormEncodingBuilder()
                .add("nodoMatriz", nodoMatriz)
                .add("NodoB", NodoB)
                .add("NodoBB", nodoBB)
                .add("nombreCancion", nombreCancion)
                .add("path", path)
                .build();
        String r = getString("insertarCanciones", formBoby);
        System.out.println(r + "---Estado de Insertar Canciones: \n");
    }
    
    //eliminar canciones
    public void eliminarCancion(String anio, String genero, String album, String artista,String nombreCancion, String path) {
        RequestBody formBoby = new FormEncodingBuilder()
                .add("anio", anio)
                .add("genero", genero)
                .add("album", album)
                .add("artista", artista)
                .add("nombreCancion", nombreCancion)
                .add("path", path)
                .build();
        cadena = getString("eliminarCancion", formBoby);
        System.out.println(cadena + "--Estado Eliminar Canciones \n");
    }
    
    public boolean eliminarNodoM(String anio, String genero){
     RequestBody formBoby = new FormEncodingBuilder()
                .add("anio", anio)
                .add("genero", genero)
                .build();
        cadena = getString("eliminarNodoMatriz", formBoby);
        System.out.println(cadena + "---Estado Eliminar Nodos de la mtriz: \n");
         return !cadena.equals("False");
    }
    
 public boolean searchYear(String anio){
 RequestBody formBoby = new FormEncodingBuilder()
                .add("anio", anio)
                .build(); 
       cadena = getString("todoAnio", formBoby);
       System.out.println(cadena + "---BUSQUEDA COMPLETA: \n");
        return !cadena.equals("False");
 }
    
    //muestro la Grafica Especifica de Canciones
    public void graphListaCanciones(String album) {
        RequestBody formBody = new FormEncodingBuilder()
                .add("album", album)
                .build();
        cadena = getString("graphListaCanciones", formBody);
         if (cadena.equals("False")) {
            JOptionPane.showMessageDialog(null, "No Existen Canciones para esta Peticion");
        }
        System.out.println(cadena + "---Si todo Esta bien, me mostrara la grafica \n");
    }

    public static String getString(String metodo, RequestBody formBody) {

        try {
            URL url = new URL("http://localhost:5000/" + metodo);
            Request request = new Request.Builder().url(url).post(formBody).build();
            Response response = webClient.newCall(request).execute();//Aqui obtiene la respuesta en dado caso si hayas pues un return en python
            String response_string = response.body().string();//y este seria el string de las respuesta
            return response_string;
        } catch (MalformedURLException ex) {
            
            java.util.logging.Logger.getLogger(Conection.class.getName()).log(Level.SEVERE, null, ex);
          //  JOptionPane.showMessageDialog(null, "EJECUTAR FLASK");
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Conection.class.getName()).log(Level.SEVERE, null, ex);
           // JOptionPane.showMessageDialog(null, "EJECUTAR FLASK");
        }
        return null;
    }
    
   public void eliminarNodoM(String nodoMatriz) {
        RequestBody formBoby = new FormEncodingBuilder()
                .add("nodoMatriz", nodoMatriz)
                .build();
        String r = getString("eliminarNodoM", formBoby);
        System.out.println(r + "---Si todo Esta bien, me mostrara la grafica \n");
    }

}
