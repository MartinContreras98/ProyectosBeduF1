package org.bedu.java.jse.basico.sesion8.ejemplo2;

import java.io.*;

public class Texto {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getProperty("user.home") + "/archivo.txt"));
        bw.write("Esta linea de texto ira en el archivo");
        bw.newLine();
        bw.write("Esta es una segunda linea");
        bw.newLine();
        bw.write("Esta sera la ultima linea");
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.home") + "/archivo.txt"));
        String liena = null;
        while ((liena = br.readLine()) != null){
            System.out.println(liena);
        }
        bw.close();
    }
}
