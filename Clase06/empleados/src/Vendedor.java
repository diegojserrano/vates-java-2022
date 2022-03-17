public class Vendedor extends Empleado {

    private float totalVentas;

    public Vendedor(int legajo, String nombre, float sueldoBasico, float totalVentas) {
        super(legajo, nombre, sueldoBasico);
        this.totalVentas = totalVentas;
    }

    public float getTotalVentas() {
        return totalVentas;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "totalVentas=" + totalVentas +
                "} " + super.toString();
    }

    @Override
    public float sueldoNeto() {
        return getSueldoBasico() + totalVentas * 0.01f;
    }
}
