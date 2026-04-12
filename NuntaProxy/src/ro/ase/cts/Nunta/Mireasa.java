package ro.ase.cts.Nunta;

public class Mireasa {
    
    private String nume;
    private int varsta;
    
    public Mireasa(String nume, int varsta) {
        
        super();
        this.nume = nume;
        this.varsta = varsta;
        
    }
    
    public String getNume() {
        
        return nume;
        
    }
    
    public void setNume(String nume) {
        
        this.nume = nume;
        
    }
    
    public int getVarsta() {
        
        return varsta;
        
    }
    
    public void setVarsta(int varsta) {
        
        this.varsta = varsta;
        
    }
    
    @Override
    public String toString() {
        
        return "Mireasa [nume=" + nume + ", varsta=" + varsta + "]";
        
    }
    
}