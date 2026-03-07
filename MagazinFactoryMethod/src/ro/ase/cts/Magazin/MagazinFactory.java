package ro.ase.cts.Magazin;

public class MagazinFactory {

    public static Magazin creareMagazin(TipMagazin tip, String nume, int suprafata) {

        switch(tip) {
            case ALIMENTAR:
                return new MagazinAlimentar(nume, suprafata);
            case HAINE:
                return new MagazinHaine(nume, suprafata);
            case ELECTRONICE:
                return new MagazinElectronice(nume, suprafata);
            default:
                throw new IllegalArgumentException("Tip magazin necunoscut");
        }
    }
}
