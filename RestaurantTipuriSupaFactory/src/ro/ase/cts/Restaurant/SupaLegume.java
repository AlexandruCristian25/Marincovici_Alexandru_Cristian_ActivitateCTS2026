package ro.ase.cts.Restaurant;

public class SupaLegume extends Supa {

    public SupaLegume(float pret, int gramaj) {
        super(pret, gramaj);
    }

    @Override
    public String toString() {
        return "SupaLegume -> " + super.toString();
    }
}
