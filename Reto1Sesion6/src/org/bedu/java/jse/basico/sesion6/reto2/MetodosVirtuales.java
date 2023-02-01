package org.bedu.java.jse.basico.sesion6.reto2;

public class MetodosVirtuales {
    public static void main(String[] args) {
        Figura f1 = new Triangulo();
        Figura f2 = new Cuadrado();
        Figura f3 = new Rectangulo();

        f1.formulaCalculaArea();
        f2.formulaCalculaArea();
        f3.formulaCalculaArea();

    }
}
