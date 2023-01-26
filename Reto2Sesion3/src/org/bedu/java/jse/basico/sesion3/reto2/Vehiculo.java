package org.bedu.java.jse.basico.sesion3.reto2;

public class Vehiculo {
    private Llanta[] llantas = new Llanta[4];
    private Combustible combustible = new Combustible();


    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }
    public void colocarLlantas(Llanta delanteraIzquierda, Llanta delanteraDerecha, Llanta traseraIzquierda, Llanta traseraDerecha){
        llantas[0] = delanteraDerecha;
        llantas[1] = delanteraIzquierda;
        llantas[2] = traseraIzquierda;
        llantas[3] = traseraDerecha;
    }
    public void llenarTanque(){
        combustible.setLitrosActuales(combustible.getLitrosMaximos());
    }
    public void avanza(){
        if(combustible.getLitrosActuales() > 0){
            for(Llanta llanta : llantas){
                llanta.rueda();
            }
            combustible.usa();
        }else{
            System.out.println("No hay combustible");
        }
    }



}
