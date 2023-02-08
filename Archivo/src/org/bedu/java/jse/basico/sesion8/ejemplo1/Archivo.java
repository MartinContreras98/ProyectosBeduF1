package org.bedu.java.jse.basico.sesion8.ejemplo1;

import java.io.File;

///Users/martincontreras/Desktop/temp/cursos/cursos.txt
public class Archivo {
    public static void main(String[] args) {
        File archivo = new File("/Users/martincontreras/Desktop/temp/cursos/cursos.txt");


        if(archivo.exists()){
            System.out.println("Nombre del archivo: " + archivo.getName());
            System.out.println("Ruta: " + archivo.getPath());
            System.out.println("Ruta relativa: " + archivo.getAbsolutePath());
            System.out.println("Padre: " + archivo.getParent());
            System.out.println("Existe: " + archivo.exists());
            System.out.println("Esta oculto: " + archivo.isHidden());
            System.out.println("Se puede escribir en el: " + archivo.canWrite());
            System.out.println("Se puede leer: "+ archivo.canRead());
            System.out.println("Se puede ejecutar: " + archivo.canExecute());
            System.out.println("Es un directorio: " + archivo.isDirectory());
            System.out.println("Tama;o en bytes: " + archivo.length());
        }

    }
}
