public class Venta {

    private Articulo art;
    private Persona comprador;

    public Venta(Articulo art, Persona comprador) {
        this.art = art;
        this.comprador = comprador;
    }

    public Articulo getArt() {
        return art;
    }

    public void setArt(Articulo art) {
        this.art = art;
    }

    public Persona getComprador() {
        return comprador;
    }

    public void setComprador(Persona comprador) {
        this.comprador = comprador;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "art=" + art +
                ", comprador=" + comprador +
                '}';
    }
}
