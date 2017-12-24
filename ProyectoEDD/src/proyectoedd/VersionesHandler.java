/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedd;

import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author mmari
 */
public class VersionesHandler extends DefaultHandler {

    int nivel = 1;
    private ArrayList<Usuario> usuarios = new ArrayList();
    private ArrayList<Artista> artistas = new ArrayList();
    private ArrayList<Album> albumes = new ArrayList();
    private ArrayList<Cancion> canciones = new ArrayList();
    private Usuario usuario;
    private Artista artista;
    private Cancion cancion;
    private Album album;
    private StringBuilder buffer = new StringBuilder();

    @Override
    public void characters(char[] chars, int i, int i1) throws SAXException {
        super.characters(chars, i, i1); //To change body of generated methods, choose Tools | Templates.
        buffer.append(chars, i, i1);
    }

    @Override
    public void endElement(String string, String string1, String string2) throws SAXException {
        super.endElement(string, string1, string2); //To change body of generated methods, choose Tools | Templates.
        switch (string2) {
            case "nombre":
                switch (nivel) {
                    case 1:
                        usuario.setNombreU(buffer.toString());
                        break;
                    case 2:
                        artista.setNombre(buffer.toString());
                        break;
                    case 3:
                        album.setNombre(buffer.toString());
                        break;
                    case 4:
                        cancion.setNombreC(buffer.toString());
                        break;
                }
                break;
            case "pass":
                usuario.setPass(buffer.toString());
                break;
            case "usuario":
                nivel = 1;
                break;
            case "usuarios":
                nivel = 1;
                break;
            case "archivo":
                nivel = 1;
                break;
            case "genero":
                album.setGenero(buffer.toString());
                break;
            case "año":
                album.setAnio(buffer.toString());
                break;
            case "path":
                cancion.setPath(buffer.toString());
                nivel = 4;
                break;
            case "artistas":
                nivel = 2;
                break;
            case "artista":
                nivel = 2;
                break;
            case "canciones":
                nivel = 4;
                break;
            case "cancion":
                nivel = 4;
                break;
        }
    }

    @Override
    public void startElement(String string, String string1, String string2, Attributes atrbts) throws SAXException {
        super.startElement(string, string1, string2, atrbts); //To change body of generated methods, choose Tools | Templates.
        switch (string2) {
            case "archivo":
                break;
            case "usuarios":
                nivel = 1;
                break;
            case "usuario":
                usuario = new Usuario();
                usuarios.add(usuario);
                break;
            case "nombre":
                switch (nivel) {
                    case 1:
                        buffer.delete(0, buffer.length());
                        break;
                    case 2:
                        buffer.delete(0, buffer.length());
                        break;
                    case 3:
                        buffer.delete(0, buffer.length());
                        break;
                    case 4:
                        buffer.delete(0, buffer.length());
                        break;
                }
                break;
            case "pass":
                buffer.delete(0, buffer.length());
                break;
            case "artistas":
                nivel = 2;
                break;
            case "artista":
                artista = new Artista();
                artistas.add(artista);
                nivel = 2;
                break;
            case "albumes":
                nivel = 3;
                break;
            case "album":
                album = new Album();
                albumes.add(album);
                artista.albumes.add(album);
                nivel = 3;
                break;
            case "genero":
                buffer.delete(0, buffer.length());
                break;
            case "año":
                buffer.delete(0, buffer.length());
                break;
            case "canciones":
                nivel = 4;
                break;
            case "path":
                buffer.delete(0, buffer.length());
                break;
            case "cancion":
                cancion = new Cancion();
                canciones.add(cancion);
                album.canciones.add(cancion);
                nivel = 4;
                break;
        }

    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

}
