package ro.ase.cts.Barca;

public class RezervareBarca implements Cloneable {
    
    private String marca;
    private int nrZile;
    private String numePersoana;
    
    private RezervareBarca() {
    }
    
    public RezervareBarca(String marca, int nrZile, String numePersoana) {
        
        if(marca.length() > 3) {
            
            this.marca = marca;
            
        } else {
            
            this.marca = "NaN";
            
        }
        
        if(nrZile > 1) {
            
            this.nrZile = nrZile;
            
        } else {
            
            this.nrZile = 0;
            
        }
        
        if(numePersoana.length() == 0) {
            
            this.numePersoana = numePersoana;
            
        }
        
    }
    
    public void setNumePersoana(String numePersoana) {
        
        this.numePersoana = numePersoana;
        
    }
    
    @Override
    public String toString() {
        
        final StringBuilder sb = new StringBuilder("RezervareBarca{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", nrZile='").append(nrZile).append('\'');
        sb.append(", numePersoana='").append(numePersoana);
        sb.append('{');
        
        return sb.toString();
        
    }
    
    public RezervareBarca copiaza() throws CloneNotSupportedException {
        
        return (RezervareBarca) super.clone();
        
    }
    
}