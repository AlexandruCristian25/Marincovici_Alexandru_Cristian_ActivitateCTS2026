package ro.ase.cts.Laptop;

public class LaptopFactory {

    public static Laptop creareLaptop(TipLaptop tip, String model, int ram) {

        switch(tip) {
            case GAMING:
                return new LaptopGaming(model, ram);
            case OFFICE:
                return new LaptopOffice(model, ram);
            case HOME:
                return new LaptopHome(model, ram);
            default:
                throw new IllegalArgumentException("Tip laptop necunoscut");
        }
    }
}
