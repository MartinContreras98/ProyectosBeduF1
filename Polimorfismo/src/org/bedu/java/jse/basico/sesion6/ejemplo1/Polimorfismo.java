package org.bedu.java.jse.basico.sesion6.ejemplo1;

import java.util.List;

public class Polimorfismo {
    public static void main(String[] args) {
        Venado v = new Venado();
        Animal a = v;
        Herbivoro h = v;
        Object o = v;

        System.out.println("Venado: " + (v instanceof Venado));
        System.out.println("Animal: " + (v instanceof Animal));
        System.out.println("Herbivoro: " + (v instanceof Herbivoro));
        System.out.println("Objeto: " + (v instanceof Object));
        System.out.println("List: " + (v instanceof List));

    }
}
