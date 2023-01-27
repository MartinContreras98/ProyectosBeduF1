package org.bedu.java.jse.basico.sesion5.ejemplo3;

public class Sobrecarga {
    public static void main(String[] args) {
        Equipo e1 = new Equipo("Gladiadores", "Valencia", 5);

        Equipo e2 = new Equipo("Bedu");
        System.out.println("El equipo "+ e2.getNombre() + "Tiene "+e2.getPuntos() );
    }
}
