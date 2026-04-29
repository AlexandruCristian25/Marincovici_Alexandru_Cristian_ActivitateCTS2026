package ro.ase.cts.Cinema;

public class Persoana {

    private String nume;
    private int nrLoc;

    public Persoana(String nume, int nrLoc) {
        this.nume = nume;
        this.nrLoc = nrLoc;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrLoc() {
        return nrLoc;
    }

    public void setNrLoc(int nrLoc) {
        this.nrLoc = nrLoc;
    }

    @Override
    public String toString() {
        return "Persoana [nume=" + nume + ", nrLoc=" + nrLoc + "]";
    }
    
}
