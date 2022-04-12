public class Opcion {

    private int numero;
    private String texto;

    //private Ejecutable funcion;
    private Runnable funcion;

    public Opcion(int numero, String texto, Runnable funcion) {
        this.numero = numero;
        this.texto = texto;
        this.funcion = funcion;
    }

    public void ejecutar() {
        funcion.run();
    }

    public int getNumero() {
        return numero;
    }

    public String getTexto() {
        return texto;
    }

}
