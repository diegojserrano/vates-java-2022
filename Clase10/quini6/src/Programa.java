import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Programa {

    public static void main(String[] args) {

        Sorteo s = new Sorteo();
        Random r = new Random();

        for (int i = 0; i < 5000000; i++) {

            Apuesta ap1 = new Apuesta(r.nextInt(), "Pepe Pino");

            for (int j = 0; j < 6; j++) {
                while (!ap1.agregarNumero(r.nextInt(36) + 1)) ;
            }

            s.agregarApuesta(ap1);
        }

        System.out.println("Controlando");
        for (int j = 0; j < 6; j++) {
            while (!s.agregarSorteado(r.nextInt(36) + 1)) ;
        }

        Set<Apuesta> ganadoras = s.ganadoras();
        while(ganadoras.isEmpty()) {
            System.out.println("Sorteo: " + s.toString());
            while (!s.agregarSorteado(r.nextInt(36) + 1)) ;
            ganadoras = s.ganadoras();
        }

        System.out.println("Sorteo: " + s.toString());

        for (Apuesta g: ganadoras) {
            System.out.println(g);
        }


    }
}
