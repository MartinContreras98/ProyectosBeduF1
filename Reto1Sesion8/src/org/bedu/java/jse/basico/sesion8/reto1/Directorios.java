package org.bedu.java.jse.basico.sesion8.reto1;

import java.io.File;

public class Directorios {
    public static void main(String[] args) {
        File directorioInicial = new File("/Users/martincontreras/Desktop/temp");
        muestraContenidoDirectorio(directorioInicial);


    }
    private static void colocarEspacios(String directorioPadre, char simbolo){
        System.out.println("[" + simbolo + "]");
        for (int i = 0 ; i < directorioPadre.length(); i++){
            System.out.println("-");
        }
    }
    private static void muestraContenidoDirectorio(File directorio){
        colocarEspacios(directorio.getParent(), 'D');
        System.out.println(directorio.getName());
        File[] subdirectorios = directorio.listFiles();
        for (File archivo : subdirectorios) {
            if (archivo.isFile()) {
                colocarEspacios(archivo.getParent(), 'A');
                System.out.println(archivo.getName());
            } else if (archivo.isDirectory()) {
                muestraContenidoDirectorio(archivo);
            }
        }
    }

}

