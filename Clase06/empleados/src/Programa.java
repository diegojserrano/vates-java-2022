import java.util.ArrayList;

public class Programa {

    public static void main(String[] args) {

        Empleado emp1 = new Obrero(1, "Juan", 1e5f, 20);
        Empleado emp2 = new Vendedor(2, "Ana", 1e5f, 1.5e6f);
        Empleado emp3 = new Administrativo(3, "Mario", 1e5f, true);

        System.out.println("Listado uno por uno");
        System.out.println(emp1.getNombre() + " $ " + emp1.sueldoNeto());
        System.out.println(emp2.getNombre() + " $ " + emp2.sueldoNeto());
        System.out.println(emp3.getNombre() + " $ " + emp3.sueldoNeto());


        ArrayList<Empleado> plantel = new ArrayList<>();

        plantel.add(emp1);
        plantel.add(emp2);
        plantel.add(emp3);

        System.out.println("Listado con for");
        for (Empleado emp: plantel) {
            // instanceof sólo tiene sentido si
            // la variable es de tipo referencia la clase base
            // la clase es una de las derivadas
            if (emp instanceof Vendedor) {// Llamada o invocación polimórfica
                System.out.println(emp.getNombre() + " $ " + emp.sueldoNeto());

                // Downcast o casting hacia abajo
                Vendedor v = (Vendedor)emp;
                v.getTotalVentas();

            }

        }


    }


}
