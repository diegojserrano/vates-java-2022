public class Localidad {

    private String provincia;
    private int codigo;
    private String nombre;

    public Localidad(String provincia, int codigo, String nombre) {
        this.provincia = provincia;
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
