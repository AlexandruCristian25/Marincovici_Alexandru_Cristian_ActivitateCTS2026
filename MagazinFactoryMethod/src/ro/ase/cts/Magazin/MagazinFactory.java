package ro.ase.cts.Magazin;

public class MagazinFactory {

    public static Magazin creareMagazin(TipMagazin tip, String nume, int suprafata) {

        return switch(tip) {

            case ALIMENTAR -> new MagazinAlimentar(nume, suprafata);
            case HAINE -> new MagazinHaine(nume, suprafata);
            case ELECTRONICE -> new MagazinElectronice(nume, suprafata);
            default -> throw new IllegalArgumentException("Tip magazin necunoscut: " + tip);

        };
    }
}
