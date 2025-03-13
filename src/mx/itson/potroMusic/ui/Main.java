/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.potroMusic.ui;


import java.util.ArrayList;
import java.util.List;
import mx.itson.potroMusic.entidades.Album;
import mx.itson.potroMusic.entidades.Artista;
import mx.itson.potroMusic.enums.Genero;

/**
 *
 * @author alumnog
 */
public class Main {
    public static void main(String[] args) {
        
        Artista artista = new Artista();
        artista.setNombre("Bad Bunny");
        artista.setSitioWeb("www.benito");
        
        
        Album a = new Album();
        a.setNombre("Dedí trirar más fotos cuando pude");
        a.setArtista(artista);
        a.setGenero(Genero.OTRO);
        
        List<Cancion> canciones= new ArrayList<>();
        
        
        a.setCanciones(canciones);
        
    }
    
}
