package ro.ase.cts.Magazin;

public abstract class Magazin {

    protected String nume;
    protected int suprafata;

    public Magazin(String nume, int suprafata) {
        this.nume = nume;
        this.suprafata = suprafata;
    }

    public abstract void afiseazaDetalii();
}
