package org.bedu.java.jse.basico.sesion3.ejemplo2;

public class Letras {
    public static void main(String[] args) {
        Lector lector = new Lector();
        lector.muestraMensaje("Escribe la palabra: ");
        String palabra = lector.leeEntrada();
        ContadorCaracteres contador = new ContadorCaracteres();
        int numeroVocales = contador.cuentaVocales(palabra);
        System.out.println("Hay "+ numeroVocales + " Vocales.");

        int numeroConsonantes = contador.cuentaConsonantes(palabra);
        System.out.println("Hay " + numeroConsonantes + " Consonantes");
        System.out.println("Hay " + contador.cuentaNumeros(palabra) + " Numeros");
        System.out.println("Hay " + contador.cuentaSimbolos(palabra) + " Simbolos");
    }
}
