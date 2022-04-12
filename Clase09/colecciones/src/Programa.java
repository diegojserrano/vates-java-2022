import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Programa {

    public static void main(String[] args) {

        Random r = new Random();


        HashSet<Integer> numeros = new HashSet<>();
        long n = 1000;

        long inicio = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            numeros.add(r.nextInt());
        }
        long fin = System.currentTimeMillis();
        long duracion = fin - inicio;

        System.out.println("Carga: " + duracion);

        int c = 0;
        inicio = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            if (numeros.contains(r.nextInt()))
                c++;
        }
        fin = System.currentTimeMillis();
        duracion = fin - inicio;

        System.out.println("Encontrados: " + c);
        System.out.println("Busqueda: " + duracion);

        for (Integer x: numeros) {
            System.out.println(x);
        }



    }

}
