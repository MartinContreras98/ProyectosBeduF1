import org.bedu.java.jse.basico.sesion6.ejemplo3.Numero;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Colecciones {
    public static void main(String[] args) {
        //Listas
        List<String> l = new ArrayList<>();
        l.add("uno");
        l.add("dos");
        l.add("tres");
        l.add("cuatro");
        l.add("cinco");


        for(String x : l){
            System.out.println(x);
        }
        // Conjuntos(Sets)
        Set<String> s = new HashSet<>();
        s.add("uno");
        s.add("dos");
        s.add("tres");
        s.add("cuatro");
        s.add("cinco");

        for (String x : s){
            System.out.println(x);
        }
        List<Numero> ln = new ArrayList<>();
        ln.add(new Numero("Uno"));
        ln.add(new Numero("dos"));
        ln.add(new Numero("tres"));
        ln.add(new Numero("cuatro"));
        ln.add(new Numero("cinco"));
        for(Numero x : ln){
            System.out.println(x.getNombre());
        }
        Set<Numero> sn = new HashSet<>();
        sn.add(new Numero("Uno"));
        sn.add(new Numero("dos"));
        sn.add(new Numero("tres"));
        sn.add(new Numero("cuatro"));
        sn.add(new Numero("cinco"));
        for(Numero x : sn){
            System.out.println(x.getNombre());
        }
    }
}
