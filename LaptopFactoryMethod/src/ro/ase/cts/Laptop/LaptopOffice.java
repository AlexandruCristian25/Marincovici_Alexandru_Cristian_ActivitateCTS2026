package ro.ase.cts.Laptop;

public class LaptopOffice extends Laptop {

    public LaptopOffice(String model, int ram) {

        super(model, ram);
    }

    @Override
    public void afiseazaDetalii() {

        StringBuilder sb = new StringBuilder();
        sb.append("Model: ").append(model);
        sb.append("RAM: ").append(ram);

        System.out.println(sb.toString());

    }
}
