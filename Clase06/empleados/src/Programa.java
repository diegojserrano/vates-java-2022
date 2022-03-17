import java.util.ArrayList;

public class Programa {

    public static void main(String[] args) {

        Empleado emp1 = new Obrero(1, "Juan", 1e5f, 20);
        Empleado emp2 = new Vendedor(2, "Ana", 1e5f, 1.5e6f);
        Empleado emp3 = new Administrativo(3, "Mario", 1e5f, true);

        System.out.println(emp1.getNombre() + " $ " + emp1.sueldoNeto());
        System.out.println(emp2.getNombre() + " $ " + emp2.sueldoNeto());
        System.out.println(emp3.getNombre() + " $ " + emp3.sueldoNeto());


        ArrayList<Empleado> plantel = new ArrayList<>();

        plantel.add(emp1);
        plantel.add(emp2);
        plantel.add(emp3);
        plantel.add(new Gerente(4, "Susana", 6e5f));

        for (Empleado emp: plantel) {
            // Llamada o invocación polimórfica
            System.out.println(emp.getNombre() + " $ " + emp.sueldoNeto());
        }


    }


}
