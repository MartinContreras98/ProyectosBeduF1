package org.bedu.java.jse.basico.sesion5.ejemplo1;

public class MiembrosEstaticos {
    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        Contador c4 = new Contador();

        System.out.println("c1.contadorInstancia: " + c1.getContadorInstancia());
        System.out.println("c1.contadorClase: " + Contador.getContadorClase() + "\n");
        System.out.println("c4.contadorInstancia: " + c4.getContadorInstancia());
        System.out.println("c4.contadorClase: " + Contador.getContadorClase() + "\n");


    }
}
