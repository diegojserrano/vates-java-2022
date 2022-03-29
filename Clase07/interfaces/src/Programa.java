import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Programa {

    public static void main(String[] args) {

        Persona per1 = new Persona(12,"Juan");
        Persona per2 = new Persona(25,"Juana");
        Persona per3 = new Persona(14,"Ana");
        Persona per4 = new Persona(94,"Luis");
        Persona per5 = new Persona(11,"Mario");

        Persona[] plantel = {per1, per2, per3, per4, per5};

        Arrays.sort(plantel);

        for(Persona p: plantel) {
            System.out.println(p);
        }


        Articulo art1 = new Articulo(1,"Lapiz",20);

        List<Imprimible> lista = new Vector<>();

        lista.add(per1);
        lista.add(art1);

        for(Imprimible i: lista) {
            i.imprimir();
        }

    }

}
