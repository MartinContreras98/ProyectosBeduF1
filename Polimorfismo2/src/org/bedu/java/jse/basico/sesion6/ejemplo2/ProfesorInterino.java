package org.bedu.java.jse.basico.sesion6.ejemplo2;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor{
    private LocalDate termino;

    public ProfesorInterino(String nombre, String apellido, String idProfesor, LocalDate termino){
        super(nombre, apellido, idProfesor);
        this.termino = termino;
    }

    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Fecha de termino: " + this.termino);
    }
}
