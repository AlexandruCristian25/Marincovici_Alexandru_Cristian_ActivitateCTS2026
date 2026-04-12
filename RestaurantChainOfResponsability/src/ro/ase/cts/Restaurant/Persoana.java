package ro.ase.cts.Restaurant;

public class Persoana {
    
    private String nume;
    private String nrTelefon;
    private int varsta;
    
    public Persoana(String nume, String nrTelefon, int varsta) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.varsta = varsta;
    }
    
    public Persoana(String nume) {
        this.nume = nume;
        this.nrTelefon = null;
        this.varsta = 0;
    }
    
    public String getNume() {
        return nume;
    }
    
    public void setNume(String nume) {
        this.nume = nume;
    }
    
    public String getNrTelefon() {
        return nrTelefon;
    }
    
    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }
    
    public int getVarsta() {
        return varsta;
    }
    
    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
    
}