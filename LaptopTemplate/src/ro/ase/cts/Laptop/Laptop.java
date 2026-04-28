package ro.ase.cts.Laptop;

public abstract class Laptop {

    private String marca;

    public Laptop(String marca) {
        super();
        this.marca = marca;
    }

    public abstract void cumparaLaptop(String marca);
    public abstract void schimbaLaptop(String marca);

    public final void vindeLaptop() {
        cumparaLaptop(this.marca);
        schimbaLaptop(this.marca);
    }
    
}