package ro.ase.cts.Biblioteca;

public class PermisB {

    private String numeElev;
    private int varsta;

    public PermisB(String numeElev, int varsta) {
        super();
        this.numeElev = numeElev;
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "PermisB [numeElev=" + numeElev + ", varsta=" + varsta + "]";
    }
}
