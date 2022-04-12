import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Programa {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner archivo = new Scanner(new File("personas2.txt"));
        archivo.useDelimiter("[;\\n\\r]+");

        Map<Integer, Persona> padron = new TreeMap<>();

        while(archivo.hasNextInt()) {
            int documento = archivo.nextInt();
            String nombre = archivo.next();
            String apellido = archivo.next();
            int edad = archivo.nextInt();

            Persona nueva = new Persona(documento, nombre, apellido, edad);
            padron.put(documento, nueva);



        }
        archivo.close();

        //for(Integer doc: padron.keySet())
        //    System.out.println(doc);


        //for(Persona p: padron.values())
        //    System.out.println(p);

        for(Map.Entry e: padron.entrySet())
            System.out.println(e.getKey() + " ---- " + e.getValue());


    }
}
