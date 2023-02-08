package org.bedu.java.jse.basico.sesion6.reto2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class Colecciones {
    public static void main(String[] args) {
        Mostrar m = new Mostrar();
        List<String> listaFrutas = new ArrayList<>();
        Collections.addAll(listaFrutas, "Platanos", "Sandia","Pera","Manzana","Naranja","Kiwi");
        System.out.println("La lista contiene los siguentes elemntos:");
        m.mostrarResultado(listaFrutas);
        System.out.println("\nInvertidos:");
        Collections.reverse(listaFrutas);
        m.mostrarResultado(listaFrutas);
        Collections.min(listaFrutas);
        System.out.println("\nEl primer elemento alfabeticamente:\n"+ Collections.min(listaFrutas));
        System.out.println("\nEl ultimo elemento alfabeticamente:\n"+ Collections.max(listaFrutas));
        Collections.sort(listaFrutas);
        System.out.println("\nLa lista odenada alfabeticamente: ");
        m.mostrarResultado(listaFrutas);
        System.out.println("\nla posicion de pera es: " + Collections.binarySearch(listaFrutas, "Pera"));
        System.out.println("la posicion de Manzana es: " + Collections.binarySearch(listaFrutas, "Manzana")+"\n");
        Collections.addAll(listaFrutas, "Manzana","Manzana","Manzana");
        Collections.shuffle(listaFrutas);
        m.mostrarResultado(listaFrutas);
        System.out.println("\nNumero que se repite Manzana: " + Collections.frequency(listaFrutas, "Manzana"));



    }

}
