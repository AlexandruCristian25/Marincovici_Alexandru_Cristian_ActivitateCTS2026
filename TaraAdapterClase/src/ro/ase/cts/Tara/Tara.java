package ro.ase.cts.Tara;

public class Tara {
    
    private String nume;
    private int nrZile;
    
    public Tara(String nume, int nrZile) {
        
        this.nume = nume;
        this.nrZile = nrZile;
        
    }
    
    public String getNume() {
        
        return nume;
        
    }
    
    public void setNume(String nume) {
        
        this.nume = nume;
        
    }
    
    public int getNrZile() {
        
        return nrZile;
        
    }
    
    public void setNrZile(int nrZile) {
        
        this.nrZile = nrZile;
        
    }
    
    @Override
    public String toString() {
        
        return "Tara [nume=" + nume + ", nrZile=" + nrZile + "]";
        
    }
    
}