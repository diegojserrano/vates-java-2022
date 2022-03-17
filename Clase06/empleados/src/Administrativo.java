public class Administrativo extends Empleado {

    private boolean cobraPresentismo;

    public Administrativo(int legajo, String nombre, float sueldoBasico, boolean cobraPresentismo) {
        super(legajo, nombre, sueldoBasico);
        this.cobraPresentismo = cobraPresentismo;
    }

    public boolean isCobraPresentismo() {
        return cobraPresentismo;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "cobraPresentismo=" + cobraPresentismo +
                "} " + super.toString();
    }

    @Override
    public float sueldoNeto() {
        float extra = 0;
        if (cobraPresentismo)
            extra = getSueldoBasico() * 0.13f;
        return getSueldoBasico() + extra;

    }
}
