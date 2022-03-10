import com.sun.nio.sctp.PeerAddressChangeNotification;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner archivo = new Scanner(new File("personas2.txt"));

        Persona masJoven = null;
        Persona masGrande = null;
        archivo.useDelimiter("[;\\n\\r]+");

        while (archivo.hasNextInt()) {
            int documento = archivo.nextInt();
            String nombre = archivo.next();
            String apellido = archivo.next();
            int edad = archivo.nextInt();

            Persona p = new Persona(documento, nombre, apellido, edad);

            if (masGrande == null || p.getEdad() > masGrande.getEdad()) {
                masGrande = p;
            }
            if (masJoven == null || p.getEdad() < masJoven.getEdad()) {
                masJoven = p;
            }


            System.out.println(p.getDocumento() + " " + p.getNombre() + " " + p.getApellido() + " " + p.getEdad());
        }

        System.out.println("Persona de mayor edad");
        System.out.println(masGrande.getDocumento() + " " + masGrande.getNombre() + " " + masGrande.getApellido() + " " + masGrande.getEdad());

        System.out.println("Persona de menor edad");
        System.out.println(masJoven.getDocumento() + " " + masJoven.getNombre() + " " + masJoven.getApellido() + " " + masJoven.getEdad());

    }
}
