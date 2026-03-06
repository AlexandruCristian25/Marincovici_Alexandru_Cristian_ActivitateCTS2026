package ro.ase.cts.Masina;

public abstract class Masina {

    protected String model;
    protected int putere;

    public Masina(String model, int putere) {
        this.model = model;
        this.putere = putere;
    }

    public abstract void afiseazaDetalii();
}