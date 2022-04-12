import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {




        Scanner sc = new Scanner(System.in);
        Calculadora c = new Calculadora();
        System.out.println("Ingrese un calculo: ");
        double resultado = c.calcular(sc.nextLine());
        System.out.println(resultado);
        //System.out.printf("%6.2f %s %6.2f = %6.2f", x, op, y, resultado);


    }
}
