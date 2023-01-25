package org.bedu.java.jse.basico.sesion4.ejemplo1;

public class BloquesInicializacion {
    public static void main(String[] args) {
        Alumno a1 = new Alumno();
        System.out.println("sesion: "+ a1.getSesion());
        System.out.println("Curso: "+ a1.getCurso());
        System.out.println("Objetivo: "+ a1.getObjetivo());
    }
}
