/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.potroMusic.ui;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mx.itson.potroMusic.entidades.Album;
import mx.itson.potroMusic.entidades.Artista;
import mx.itson.potroMusic.entidades.Cancion;
import mx.itson.potroMusic.enums.Genero;

/**
 *
 * @author alumnog
 */
public class Main {
    public static void main(String[] args) {
    
        
        Scanner scanner=new Scanner(System.in);    
        System.out.println("Bienvenid@ a 🎶Potro Music🎶, donde podrás agregar tus canciones y artistas favoritos");
        //ARTISTA 
        Artista artista = new Artista();
        System.out.println("Es momento de agregar a tu artista,nombre del artista que deseas agregar: ");
        artista.setNombre(scanner.nextLine());
        
        System.out.println("Agrega una pequeña descripción de" + artista.getNombre()+ "(reconocimientos, logros,etc): ");
        artista.setDescripcion(scanner.nextLine());
        
        System.out.println("Agregar el sitio web del artista: " );
        artista.setSitioWeb(scanner.nextLine());
        System.out.println("Muy bien!!!, tu artista ya quedó registrado " );
        
        
        //ALBÚM
        System.out.println("Es momento de escoger un albúm del artista " + artista.getNombre());
        Album a = new Album();
        System.out.println("Nombre del album:  ");
        a.setNombre(scanner.nextLine());
        a.setArtista(artista);
        
        System.out.println("""
                           Genero del album 
                           Seleccione:
                           1 si es POP,
                           2 si es ROCK,
                           3 si es DANCE,
                           4 si es TRAP,
                           5 si es BAND,
                           6 si es SALSA
                           7 si es OTRO Genero
                           Genero: """);
        int generoUsuario=scanner.nextInt();
        
        if(generoUsuario == 1){
         a.setGenero(Genero.POP);    
        }if(generoUsuario == 2){
            a.setGenero(Genero.ROCK); 
        }if(generoUsuario == 3){
            a.setGenero(Genero.DANCE); 
        }if(generoUsuario == 4){
            a.setGenero(Genero.TRAP); 
        }if(generoUsuario == 5){
            a.setGenero(Genero.BAND); 
        }if(generoUsuario == 6){
            a.setGenero(Genero.SALSA); 
        }if(generoUsuario == 7){
            a.setGenero(Genero.OTRO); 
        }else{
           System.out.println("Valor incorecto, procura agregar un numero según nuestras opciones");
        }
        
        
        //Canciones
        List<Cancion> canciones= new ArrayList<>();
        System.out.println("""
                           """);
        
        Cancion cancion1=new Cancion();
        cancion1.setNombre("DTMF");
        cancion1.setOtrden(1);
        cancion1.setDuracion(237);
        
        
        canciones.add(cancion1);
        a.setCanciones(canciones);
        
         System.out.println("Artista:  " + artista.getNombre() +","+
        " Descripción:  " +artista.getDescripcion()+ ","+
        " sitio web:  " +artista.getSitioWeb()+
        " Nombre del album del artista: "+ a.getNombre()+" Genero del album: "+a.getGenero()
         );

        
       
    
    }
}

