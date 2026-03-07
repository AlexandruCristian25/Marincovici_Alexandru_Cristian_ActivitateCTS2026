package ro.ase.cts.Laptop;

public class LaptopHome extends Laptop {

    public LaptopHome(String model, int ram) {
        super(model, ram);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Laptop Home: " + model + " | RAM: " + ram + "GB");
    }
}
