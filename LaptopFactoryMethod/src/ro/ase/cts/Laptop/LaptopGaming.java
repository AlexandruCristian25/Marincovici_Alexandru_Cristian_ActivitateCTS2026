package ro.ase.cts.Laptop;

public class LaptopGaming extends Laptop {

    public LaptopGaming(String model, int ram) {

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
