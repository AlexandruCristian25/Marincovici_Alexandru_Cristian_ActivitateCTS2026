package ro.ase.cts.Laptop;

public abstract class Laptop {

    protected String model;
    protected int ram;

    public Laptop(String model, int ram) {
        this.model = model;
        this.ram = ram;
    }

    public abstract void afiseazaDetalii();
}
