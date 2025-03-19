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
    
    try{    
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
        
        if (generoUsuario ==1){
            a.setGenero(Genero.POP);
        }else if(generoUsuario == 2){
            a.setGenero(Genero.ROCK); 
        }else if(generoUsuario == 3){
            a.setGenero(Genero.DANCE); 
        }else if(generoUsuario == 4){
            a.setGenero(Genero.TRAP); 
        }else if(generoUsuario == 5){
            a.setGenero(Genero.BAND); 
        }else if(generoUsuario == 6){
            a.setGenero(Genero.SALSA); 
        }else if(generoUsuario == 7){
            a.setGenero(Genero.OTRO); 
        }else{
           System.out.println("Valor incorecto, procura agregar un numero según nuestras opciones");
        }
        
       
        
        //Canciones
        List<Cancion> canciones= new ArrayList<>();
        System.out.println("¿Cuántas canciónes tiene el album "+ a.getNombre());
        int albumCantidad=scanner.nextInt();
        
        
        for (int i= 1; i<=albumCantidad;i++){
            
            Cancion cancion=new Cancion();
            
            System.out.println("Nombre de la canción");
            String cancionNombre=scanner.next();
            cancion.setNombre(cancionNombre);
            
            System.out.println("Duración de la canción" + cancion.getNombre()+ " en segundos");
            int duracionCancion1=scanner.nextInt();
            cancion.setDuracion(duracionCancion1);
            
            System.out.println("Orden de la cancion");
            int ordenCancion1=scanner.nextInt();
            cancion.setOtrden(ordenCancion1);
            
        canciones.add(cancion);
            
        }
    a.setCanciones(canciones);

        System.out.println("""
                           <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                                                                               🎶✨PotroMusic✨🎶
                                                                                                                                       """);                               
      
        System.out.println(" Tu artista favprito es......"+ artista.getNombre() +"    | Recuerda que lo puedes encontrar en "+ artista.getSitioWeb());
        System.out.println("                                                      | Ahí encontraras más datos como los siguientes "+ artista.getDescripcion());
        
        System.out.println("<<<<<<Es momento de iniciar tu experiencia musical✨🎶, para esto haz selecionado el album " + a.getNombre()+ 
                " Excelente eleción, disfruta tus canciones de este albúm de genero " +a.getGenero()+ ">>>>>>>>");
        
        
            for(Cancion c : a.getCanciones()){
            System.out.println("____________________________________________________________________________________________________________________________________________________");
            System.out.println("|         puesto numero: "+    c.getOtrden() +"                                                                                                                                |");
            System.out.println("|  "                                                                           
                                                                          +c.getNombre()                                                                                             );
           
        
    System.out.println("_____________________________________o_______________________________________________________________________________________________________"+ c.getDuracion()+ "segundos");      
    System.out.println(""" 
                                                               |<                 |>                 >|                          
                                                                                                                                                  """);
    }
  }catch(Exception ex){
            System.err.println("ooh, ha ocurrido un error, procura ingrear lo que se pide");
       } 
    }
}    

