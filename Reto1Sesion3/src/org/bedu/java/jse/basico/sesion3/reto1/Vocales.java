package org.bedu.java.jse.basico.sesion3.reto1;


import java.util.Scanner;

public class Vocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una oracion: ");
        String palabra = scanner.nextLine();
        int vocales = 0;

        for (char caracter : palabra.toLowerCase().toCharArray()){
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
                vocales ++;
            }
        }
        System.out.println("El numero de vocales es: "+ vocales);

    }
}
