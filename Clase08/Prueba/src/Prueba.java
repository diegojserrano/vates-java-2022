import java.util.Arrays;
import java.util.Random;

public class Prueba {
    public static void main(String[] args) {

        Par<Integer> x = new Par<>(23,56);
        Par<Integer> y = new Par<>(61,12);
        Par<String> z = new Par<>("aaaa","bbbb");

        System.out.println(x);
        System.out.println("Miembros iguales " + x.miembrosIguales());
        System.out.println("Miembros ascendentes " + x.miembrosAscendentes());

        System.out.println(y);
        System.out.println("Miembros iguales " + y.miembrosIguales());
        System.out.println("Miembros ascendentes " + y.miembrosAscendentes());

        System.out.println(z);
        System.out.println("Miembros iguales " + z.miembrosIguales());
        System.out.println("Miembros ascendentes " + z.miembrosAscendentes());

        Random r = new Random();
        Par<Integer> []v = new Par[10];
        for (int i = 0; i < 10; i++) {
            Par<Integer> p = new Par<>(r.nextInt(100),r.nextInt(100));
            v[i] = p;
        }

        System.out.println("Antes de ordenar");
        for(Par p:v)
            System.out.println(p);

        Arrays.sort(v);

        System.out.println("Despues de ordenar");
        for(Par p:v)
            System.out.println(p);
    }
}
