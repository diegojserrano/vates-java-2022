import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner archivo = new Scanner(new FileReader("CP.txt"));
        Scanner teclado = new Scanner(System.in);

        archivo.useDelimiter("[;\\n\\r]+");

        ArrayList<Localidad> localidades = new ArrayList<>();

        while(archivo.hasNext()) {
            String provincia = archivo.next();
            int codigo = archivo.nextInt();
            String nombre = archivo.next();

            Localidad nueva = new Localidad(provincia, codigo, nombre);

            localidades.add(nueva);

        }

        System.out.println("Ingrese la localidad a buscar (fin con cadena vacia)");
        String buscada = teclado.nextLine().toUpperCase();

        while (!buscada.isEmpty()) {
            for (Localidad l : localidades) {
                if (l.getNombre().contains(buscada))
                    System.out.println(l.getProvincia() + " " + l.getNombre());
            }

            System.out.println("Ingrese la localidad a buscar");
            buscada = teclado.nextLine().toUpperCase();
        }
    }
}
