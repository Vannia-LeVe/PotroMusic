/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.potroMusic.entidades;

/**
 *
 * @author alumnog
 */
public class Cancion {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the duracion
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * @return the otrden
     */
    public int getOtrden() {
        return otrden;
    }

    /**
     * @param otrden the otrden to set
     */
    public void setOtrden(int otrden) {
        this.otrden = otrden;
    }
    private String nombre;
    private int duracion;
    private int otrden;
    
    
}
