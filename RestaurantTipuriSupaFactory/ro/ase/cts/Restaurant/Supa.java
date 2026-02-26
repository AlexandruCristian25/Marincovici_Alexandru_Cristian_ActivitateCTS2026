package ro.ase.cts.Restaurant;

public abstract class Supa {
    protected float pret;
    protected int gramaj;

    public Supa(float pret, int gramaj) {
        this.pret = pret;
        this.gramaj = gramaj;
    }

    @Override
    public String toString() {
        return "Supa{" +
                "pret=" + pret +
                ", gramaj=" + gramaj +
                '}';
    }
}
