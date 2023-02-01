package org.bedu.java.jse.basico.sesion6.ejemplo2;

import java.time.LocalDate;
import java.time.Month;

public class Polimorfismo {
    public static void main(String[] args) {
        Profesor p1 = new Profesor("Juan", "Hdz Garcia", "Prof 22-387-11");
        Profesor p2 = new ProfesorInterino("Maria", "Perez Sanchez", "Prof 22-565-98", LocalDate.of(2023, Month.OCTOBER, 17));
        p1.mostrarDatos();
        p2.mostrarDatos();

    }
}
