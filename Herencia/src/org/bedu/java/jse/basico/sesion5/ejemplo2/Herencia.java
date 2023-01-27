package org.bedu.java.jse.basico.sesion5.ejemplo2;

public class Herencia {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(4,4,"Estilo 1");
        t1.mostrarEstilo();
        t1.mostrarDimension();
        System.out.println("area: "+ t1.area());

    }
}
