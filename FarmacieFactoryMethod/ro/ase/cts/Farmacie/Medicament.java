package ro.ase.cts.Farmacie;

public abstract class Medicament {
    protected String denumire;
    protected float pret;

    public Medicament(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public abstract void afiseazaDescriere();

    @Override
    public String toString() {
        return "Medicament{" +
                "denumire='" + denumire + '\'' +
                ", pret=" + pret +
                '}';
    }
}
