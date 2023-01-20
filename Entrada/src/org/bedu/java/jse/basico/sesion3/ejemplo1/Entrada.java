package org.bedu.java.jse.basico.sesion3.ejemplo1;

import java.io.Console;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args){
     /*   Scanner scanner = new Scanner(System.in);//dese new con un constructor
        System.out.println("Escribe tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola " + nombre);*/
        Console console = System.console();//Generando desde un metodo de otra clase
        if (console == null){
            System.err.println("No hay consola.");
            System.exit(1);// 0- termino bien, 1- termino con error
        }
        String nombre = console.readLine("%s", "Escribe tu nombre: ");//Especificador de formato s- String
        System.out.println("Hola " + nombre);
    }
}
