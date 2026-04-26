package ro.ase.cts.Biblioteca;

public class Biblioteca implements IBiblioteca {

    private int idPermis;
    private int nrCarte;
    private int nrRaion;

    @Override
    public void printare(PermisB permisB) {
        System.out.println(this.toString() + " " + permisB.toString());
    }

    public Biblioteca(int idPermis, int nrCarte, int nrRaion) {
        super();
        this.idPermis = idPermis;
        this.nrCarte = nrCarte;
        this.nrRaion = nrRaion;
    }

    @Override
    public String toString() {
        return "Biblioteca [idPermis=" + idPermis + ", nrCarte=" + nrCarte + ", nrRaion=" + nrRaion + "]";
    }
}
