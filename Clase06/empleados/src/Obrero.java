public class Obrero extends Empleado {

    private int diasTrabajados;

    public Obrero(int legajo, String nombre, float sueldoBasico, int diasTrabajados) {
        super(legajo, nombre, sueldoBasico);
        this.diasTrabajados = diasTrabajados;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    @Override
    public String toString() {
        return "Obrero{" +
                "diasTrabajados=" + diasTrabajados +
                "} " + super.toString();
    }

    @Override
    public float sueldoNeto() {
        return getSueldoBasico() / 22 * diasTrabajados;
    }
}
