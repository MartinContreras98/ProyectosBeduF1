package org.bedu.java.jse.basico.sesion5.ejemplo3;

public class Equipo {
    private String nombre, ciudad;
    private int puntos;

    public Equipo (String nombre, String ciudad, int puntos){
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.puntos = puntos;
    }
    public Equipo (String nombre, String ciudad){
        this(nombre,ciudad,0);
    }
    public Equipo (String ciudad){
        this("Anonimo", ciudad);
    }
    public void actualiza(String nombre, int puntos){
        this.nombre = nombre;
        this.puntos = puntos;
    }
    public void actualiza(String nombre){
        this.nombre = nombre;
    }



    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getPuntos() {
        return puntos;
    }


}
