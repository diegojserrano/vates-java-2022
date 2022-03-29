import java.util.ArrayList;
import java.util.LinkedList;

public class Programa {

    public static void main(String[] args) {

        LinkedList<Integer> lista = new LinkedList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);


        int suma = 0;

        for(int i = 0; i < lista.size(); i++) {
                suma += lista.get(i);
        }

        suma = 0;
        for(Integer x :lista) {
            suma += x;
        }

        System.out.println(suma);

        ArrayList<String> dias = new ArrayList<>();

        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miercoles");
        dias.add("Jueves");
        dias.add("Viernes");

        String suma2 = "";

        for(String dia: dias)
            suma2 += dia.toUpperCase();

        System.out.println(suma2);



    }
}
