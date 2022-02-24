import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*

Declarar dos variables enteras, los ingrese por teclado,
calcular su suma y luego imprimir la suma

*/
public class Principal {

    public static void main(String[] args) throws FileNotFoundException {

        int a, b;
        Scanner archivo = new Scanner(new File("numeros.txt"));

        System.out.println("Ingrese dos números");
        a = archivo.nextInt();
        b = archivo.nextInt();

        System.out.println("Los números recibidos son " + a + " y " + b);
        int suma = a + b;
        int diferencia = a - b;
        int producto = a * b;
        float cociente = (float) a/b;
        System.out.println("La suma de los números es: " + suma);
        System.out.println("La diferencia de los números es: " + diferencia);
        System.out.println("El producto de los números es: " + producto);
        System.out.println("El cociente de los números es: " + cociente);
    }
}
