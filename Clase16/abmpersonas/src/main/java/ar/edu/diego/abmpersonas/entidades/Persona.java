package ar.edu.diego.abmpersonas.entidades;

public class Persona implements Comparable<Persona> {

    private int documento;
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(int documento, String nombre, int edad) {
        this.documento = documento;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "documento=" + documento +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }


    @Override
    public int compareTo(Persona o) {
        return this.documento - o.documento;
    }
}
