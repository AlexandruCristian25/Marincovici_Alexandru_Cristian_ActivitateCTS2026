package ro.ase.cts.Aeroport;

public class Rezervare implements Prototype {

    private String numePasager;
    private String destinatie;
    private int loc;

    public Rezervare(String numePasager, String destinatie, int loc) {
        this.numePasager = numePasager;
        this.destinatie = destinatie;
        this.loc = loc;
    }

    @Override
    public Prototype clone() {
        return new Rezervare(this.numePasager, this.destinatie, this.loc);
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "numePasager='" + numePasager + '\'' +
                ", destinatie='" + destinatie + '\'' +
                ", loc=" + loc +
                '}';
    }
}
