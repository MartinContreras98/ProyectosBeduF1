package org.bedu.java.jse.basico.sesion6.ejemplo3;

public class Numero {
    private String nombre;
    public Numero(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o.getClass() != this.getClass() || o == null){
            return false;
        }
        Numero n = (Numero)o;
        return this.nombre != null ? this.nombre.equals(n.nombre) : n.nombre == null;

    }
    public int hashCode(){
        return this.nombre != null ? this.nombre.hashCode(): 0;
    }
}
