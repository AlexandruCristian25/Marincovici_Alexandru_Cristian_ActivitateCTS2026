package ro.ase.cts.Laptop;

public class LaptopOffice extends Laptop {

    public LaptopOffice(String model, int ram) {
        super(model, ram);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Laptop Office: " + model + " | RAM: " + ram + "GB");
    }
}
