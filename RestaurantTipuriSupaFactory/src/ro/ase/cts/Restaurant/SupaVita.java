package ro.ase.cts.Restaurant;

public class SupaVita extends Supa {

    public SupaVita(float pret, int gramaj) {
        super(pret, gramaj);
    }

    @Override
    public String toString() {
        return "SupaVita -> " + super.toString();
    }
}
