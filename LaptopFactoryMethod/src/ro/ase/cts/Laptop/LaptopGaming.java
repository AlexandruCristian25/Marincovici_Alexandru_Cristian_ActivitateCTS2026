package ro.ase.cts.Laptop;

public class LaptopGaming extends Laptop {

    public LaptopGaming(String model, int ram) {
        super(model, ram);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Laptop Gaming: " + model + " | RAM: " + ram + "GB");
    }
}
