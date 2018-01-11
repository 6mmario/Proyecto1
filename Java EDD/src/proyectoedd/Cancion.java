/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedd;

/**
 *
 * @author mmari
 */
public class Cancion {
    String nombreC;
    String Path;

    public Cancion() {
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombrec) {
        this.nombreC = nombrec;
    }

    public String getPath() {
        return Path;
    }

    public void setPath(String Path) {
        this.Path = Path;
    }

    @Override
    public String toString() {
        return "Cancion{" + "nombreC=" + nombreC + ", Path=" + Path + '}';
    }
    
}
