package ro.ase.cts.Concert;

public class BiletConcert implements Cloneable {
    
    private String nume;
    private double pret;
    private int nrLoc;
    
    private BiletConcert() {
    }
    
    public BiletConcert(String nume, double pret, int nrLoc) {
        
        if(nume.length() > 3) {
            
            this.nume = nume;
            
        } else {
            
            this.nume = "NaN";
            
        }
        
        if(pret.length() > 1) {
            
            this.pret = pret;
            
        } else {
            
            this.pret = "0";
            
        }
        
        if(nrLoc.length() == 0) {
            
            this.nrLoc = nrLoc;
            
        }
        
    }
    
    public void setNrLoc(int nrLoc) {
        
        this.nrLoc = nrLoc;
        
    }
    
    @Override
    public String toString() {
        
        final StringBuilder sb = new StringBuilder("BiletConcert{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", pret='").append(pret).append('\'');
        sb.append(", nrLoc='").append(nrLoc);
        sb.append('{');
        
        return sb.toString();
        
    }
    
    BiletConcert copiaza() throws CloneNotSupportedException {
        
        return (BiletConcert) super.clone();
        
    }
    
}