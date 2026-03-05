package ro.ase.cts.Restaurant;

public class SupaCiuperci extends Supa {

    public SupaCiuperci(float pret, int gramaj) {
        super(pret, gramaj);
    }

    @Override
    public String toString() {
        return "SupaCiuperci -> " + super.toString();
    }
}
