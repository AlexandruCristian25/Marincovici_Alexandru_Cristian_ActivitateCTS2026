package ro.ase.cts.Masina;

public class MasinaFactory {

    public static Masina creareMasina(TipMasina tip, String model, int putere) {

        switch(tip) {
            case CURSE:
                return new MasinaCurse(model, putere);
            case ORAS:
                return new MasinaOras(model, putere);
            case MARFA:
                return new MasinaMarfa(model, putere);
            default:
                throw new IllegalArgumentException("Tip masina necunoscut");
        }
    }
}