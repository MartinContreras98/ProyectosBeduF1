import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Martin", (byte) 24, LocalDate.of(1998, Month.SEPTEMBER, 4));
        p1.mostrarPersona();

    }
}
