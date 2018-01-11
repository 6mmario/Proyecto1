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
public class Usuario {
    String nombreU;
    String Pass;

    public Usuario() {
    }

    public String getNombreU() {
        return nombreU;
    }

    public void setNombreU(String nombre) {
        this.nombreU = nombre;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombreU + ", Pass=" + Pass + '}';
    }
    
    
}
