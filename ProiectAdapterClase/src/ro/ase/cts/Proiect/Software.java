package ro.ase.cts.Proiect;

public class Software {
    
    private String nume;
    private int nrLuni;
    
    public Software(String nume, int nrLuni) {
        this.nume = nume;
        this.nrLuni = nrLuni;
    }
    
    public String getNume() {
        return nume;
    }
    
    public void setNume(String nume) {
        this.nume = nume;
    }
    
    public int getNrLuni() {
        return nrLuni;
    }
    
    public void setNrLuni(int nrLuni) {
        this.nrLuni = nrLuni;
    }
    
    @Override
    public String toString() {
        return "Software [nume=" + nume + ", nrLuni=" + nrLuni + "]";
    }
    
}