package ro.ase.cts.BonCasa;

public class Farmacie {

    private String nume;

    public Farmacie(String nume) {
        this.nume = nume;
    }

    public BonCasa emiteBon() {
        BonCasa bon = BonCasaFactory.getBonCasa();
        return bon;
    }

    @Override
    public String toString() {
        return "Farmacie{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
