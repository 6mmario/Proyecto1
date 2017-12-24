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
public class Artista {
    String nombre;
    ArrayList<Album> albumes = new ArrayList();

    public Artista() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<Album> albumes) {
        this.albumes = albumes;
    }

    @Override
    public String toString() {
        return "Artista{" + "nombre=" + nombre + '}';
    }

    
}
