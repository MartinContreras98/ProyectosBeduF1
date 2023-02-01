package org.bedu.java.jse.basico.sesion6.ejemplo2;

public abstract class Persona {
    private String nombre, apellido;

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;

    }

    public void mostrarDatos(){
        System.out.println("Persona: " + this.nombre + " Apellidos: " + this.apellido);
    }
}
