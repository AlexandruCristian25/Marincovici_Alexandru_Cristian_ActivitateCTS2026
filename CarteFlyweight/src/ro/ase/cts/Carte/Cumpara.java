package ro.ase.cts.Carte;

public class Cumpara {

    private String nume;
    private String gen;

    public Cumpara(String nume, String gen) {

        super();
        this.nume = nume;
        this.gen = gen;

    }

    @Override
    public String toString() {

        return "Cumpara [nume=" + nume + ", gen=" + gen + "]";

    }

}