package ro.ase.cts.Restaurant;

public class SupaFactory {

    public static Supa creareSupa(TipSupa tip, float pret, int gramaj) {

        switch (tip) {
            case LEGUME:
                return new SupaLegume(pret, gramaj);
            case CIUPERCI:
                return new SupaCiuperci(pret, gramaj);
            case VITA:
                return new SupaVita(pret, gramaj);
            default:
                throw new IllegalArgumentException("Tip supa invalid");
        }
    }
}
