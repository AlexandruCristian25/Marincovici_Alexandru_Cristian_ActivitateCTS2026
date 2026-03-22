package ro.ase.cts.Laptop;

public class LaptopFactory {

    public static Laptop creareLaptop(TipLaptop tip, String model, int ram) {

        return switch(tip) {
            case GAMING -> new LaptopGaming(model, ram);
            case OFFICE -> new LaptopOffice(model, ram);
            case HOME -> new LaptopHome(model, ram);
            default -> throw new IllegalArgumentException("Tip laptop necunoscut" + tip);
        };
    }
}
