package org.bedu.java.jse.basico.sesion5.ejemplo2;

public class FiguraPlana {
    private final double base, altura;
    public FiguraPlana(double base, double altura){
        this.base = base;
        this.altura = altura;
    }


    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void mostrarDimension(){
        System.out.println("La base y altura son: " + this.base+ " y "+ this.altura);
    }
}
