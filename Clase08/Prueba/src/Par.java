public class Par<T extends Comparable> implements Comparable<Par<T>> {


    private T c1, c2;

    public Par(T c1, T c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public Par() {
    }

    public T getC1() {
        return c1;
    }

    public void setC1(T c1) {
        this.c1 = c1;
    }

    public T getC2() {
        return c2;
    }

    public void setC2(T c2) {
        this.c2 = c2;
    }


    public void traspolar() {
        T aux = this.c1;
        this.c1 = c2;
        this.c2 = aux;
    }

    public Par<T> transpuesto() {
        return new Par<T>(c2, c1);
    }

    public boolean miembrosIguales() {
        return c1.compareTo(c2) == 0;
    }

    public boolean miembrosDiferentes() {
        return !miembrosIguales();
    }

    public boolean miembrosAscendentes() {
        return c1.compareTo(c2) < 0;
    }

    public boolean miembrosDescendentes() {
        return c1.compareTo(c2) > 0;
    }

    @Override
    public String toString() {
        return String.format("(%s;%s)", c1.toString(), c2.toString());
    }

    @Override
    public int compareTo(Par<T> o) {
        if (this.c1.compareTo(o.c1) == 0)
            return this.c2.compareTo(o.c2);
        return this.c1.compareTo(o.c1);
    }
}
