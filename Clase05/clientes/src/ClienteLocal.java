public class ClienteLocal extends Cliente {

    private int sucursal;

    public ClienteLocal(int codigo, String nombre, int sucursal) {
        super(codigo, nombre);
        this.sucursal = sucursal;
    }

    public int getSucursal() {
        return sucursal;
    }

    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }


    public String toString() {
        return super.toString() + " - " + this.sucursal;
    }

}
