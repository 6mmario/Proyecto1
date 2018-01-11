/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedd;

import java.util.ArrayList;

/**
 *
 * @author mmari
 */
public class Album {
    
    Cancion cancione = new Cancion();
    
    String nombre;
    String genero;
    String anio;

    ArrayList<Cancion> canciones = new ArrayList();
    

    public Album() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "Album{" + "nombre=" + nombre + ", genero=" + genero + ", anio=" + anio +'}';
    }

  

}
