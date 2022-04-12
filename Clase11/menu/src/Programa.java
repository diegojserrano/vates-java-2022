import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Opcion op1 = new Opcion(1, "Saludar", () -> System.out.println("Hola"));
        Opcion op2 = new Opcion(2, "Despedirse", () -> System.out.println("Chau"));
        Opcion salir = new Opcion(9, "Salir", null);

        Opcion[] menú = new Opcion[10];

        menú[1] = op1;
        menú[2] = op2;
        menú[9] = salir;

        System.out.println("Menú de opciones");
        for (Opcion o: menú)
            if (o != null)
                System.out.println(o.getNumero() + ": " + o.getTexto());
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la opcion: ");
        int opcion = teclado.nextInt();

        while (opcion != 9) {
            menú[opcion].ejecutar();
            System.out.print("Ingrese la opcion: ");
            opcion = teclado.nextInt();
        }

    }
}
