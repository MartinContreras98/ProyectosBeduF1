package org.bedu.java.jse.basico.sesion3.reto2;

public class Combustible {
    private short litrosMaximos, litrosActuales;

    public short getLitrosActuales() {
        return litrosActuales;
    }

    public void setLitrosActuales(short litrosActuales) {
        this.litrosActuales = litrosActuales;
    }

    public short getLitrosMaximos() {
        return litrosMaximos;
    }

    public void setLitrosMaximos(short litrosMaximos) {
        this.litrosMaximos = litrosMaximos;
    }
    public void usa(){
        litrosActuales --;
        System.out.println("Quedan "+ litrosActuales + " Litros");
    }
}
