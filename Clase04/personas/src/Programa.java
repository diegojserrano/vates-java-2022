import com.sun.nio.sctp.PeerAddressChangeNotification;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner archivo = new Scanner(new File("personas2.txt"));

        Persona masJoven = null;
        Persona masGrande = null;
        int cantidadMayorEdad = 0;
        int cantidadPerez = 0;
        archivo.useDelimiter("[;\\n\\r]+");
        ArrayList<Persona> padron = new ArrayList<>();

        while (archivo.hasNextInt()) {
            int documento = archivo.nextInt();
            String nombre = archivo.next();
            String apellido = archivo.next();
            int edad = archivo.nextInt();

            Persona p = new Persona(documento, nombre, apellido, edad);

            padron.add(p);
        }


        System.out.println(padron.size());

        masGrande = padron.get(0);

        for(Persona cadaUna: padron) {
            if (cadaUna.getEdad() > masGrande.getEdad()) {
                masGrande = cadaUna;
                cantidadMayorEdad = 1;
            }
            else if (cadaUna.getEdad() == masGrande.getEdad())
                cantidadMayorEdad++;
        }

        


//
//
//
//            if (masGrande == null || p.getEdad() > masGrande.getEdad()) {
//                masGrande = p;
//                cantidadMayorEdad = 1;
//            }
//            else if (masGrande == null || p.getEdad() == masGrande.getEdad()) {
//                cantidadMayorEdad++;
//            }
//            if (masJoven == null || p.getEdad() < masJoven.getEdad()) {
//                masJoven = p;
//            }
//
//            if (p.getApellido().equalsIgnoreCase("PEREZ"))
//                cantidadPerez++;
//        }
//
//        System.out.println("Persona de mayor edad");
//        System.out.println(masGrande.getDocumento() + " " + masGrande.getNombre() + " " + masGrande.getApellido() + " " + masGrande.getEdad());
//        System.out.println("Hay " + cantidadMayorEdad + " personas de esa edad");
//
//        System.out.println("Persona de menor edad");
//        System.out.println(masJoven.getDocumento() + " " + masJoven.getNombre() + " " + masJoven.getApellido() + " " + masJoven.getEdad());
//
//        System.out.println("Hay " + cantidadPerez + " personas de apellido PEREZ");
    }
}
