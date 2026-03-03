package ro.ase.cts.BonCasa;

public class BonCasaFactory {

    private static BonCasa prototip = new BonCasa("FarmacieDefault");

    static {
        prototip.adaugaProdus("ProdusInitial", 0);
    }

    public static BonCasa getBonCasa() {
        return prototip.clone();
    }
}
