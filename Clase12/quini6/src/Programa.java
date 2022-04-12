import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class Programa {

    public static void main(String[] args) {

        Sorteo s = new Sorteo();
        Random r = new Random();

        IntStream.range(0, 50).forEach(x -> {
            Apuesta ap1 = new Apuesta(r.nextInt(), "Pepe Pino");
            r.ints(1, 37)
                    .distinct()
                    .limit(6)
                    .forEach(y -> ap1.agregarNumero(y));

            System.out.println(ap1);
            s.agregarApuesta(ap1);
        });

        System.out.println("Controlando");
        r.ints(1, 37)
                .distinct()
                .limit(6)
                .forEach(x -> s.agregarSorteado(x));

        Set<Apuesta> ganadoras = s.ganadoras();
        while (ganadoras.isEmpty()) {
            System.out.println("Sorteo: " + s.toString());
            while (!s.agregarSorteado(r.nextInt(36) + 1)) ;
            ganadoras = s.ganadoras();
        }

        System.out.println("Sorteo: " + s);

        // Method reference
        ganadoras.stream().forEach(System.out::println);
    }
}
