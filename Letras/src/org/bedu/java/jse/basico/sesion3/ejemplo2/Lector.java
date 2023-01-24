package org.bedu.java.jse.basico.sesion3.ejemplo2;
import java.util.Scanner;

/*
* Clase encargada de manejar la lectura de datos por parte del usuario
* */
public class Lector {
    /*  Objeto Scanner encargado de realizar la lectura de datos */
    private Scanner scanner = new Scanner(System.in);

    public void muestraMensaje(String mensaje) {

        System.out.println(mensaje);
    }
    public String leeEntrada(){
        return scanner.nextLine();

    }
}
