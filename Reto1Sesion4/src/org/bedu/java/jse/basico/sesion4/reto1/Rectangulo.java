package org.bedu.java.jse.basico.sesion4.reto1;

public class Rectangulo {
    private double alto, ancho;
    public Rectangulo(double alto, double ancho ){
        this.alto = alto;
        this.ancho = ancho;
    }
    public Rectangulo(double lados){
        this(lados, lados);
    }
    public Rectangulo(){
        this(0);
    }
    public double calcularArea(){
        return alto * ancho;
    }


}
