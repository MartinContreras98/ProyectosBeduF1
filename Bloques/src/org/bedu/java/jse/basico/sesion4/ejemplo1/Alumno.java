package org.bedu.java.jse.basico.sesion4.ejemplo1;

public class Alumno {
    private String curso, objetivo;
    private byte sesion;
    {
        curso = "Java Standard Edition 2023";
    }
    {
        curso = "Java Standard Edition";
        sesion = 4;
        objetivo = "Dominar Java";
    }

    public String getCurso(){
        return curso;
    }
    public byte getSesion(){
        return sesion;
    }
    public String getObjetivo(){
        return objetivo;
    }

}
