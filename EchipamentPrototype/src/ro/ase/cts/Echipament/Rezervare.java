import ro.ase.cts.Echipament;

public class Rezervare implements Cloneable {
    
    private String tip;
    private double pret;
    private String zi;
    
    private Rezervare() {
    }
    
    public Rezervare(String tip, double pret, String tip) {
        
        if(tip.length() > 3) {
            
            this.tip = tip;
            
        } else {
            
            this.tip = "NaN";
            
        }
        
        if(pret.length() > 1) {
            
            this.pret = pret;
            
        } else {
            
            this.pret = "0";
            
        }
        
        if(ora.length() == 0) {
            
            this.ora = ora;
            
        }
        
    }
    
    private setOra(String ora) {
        
        this.ora = ora;
        
    }
    
    @Override
    public String toString() {
        
        final StringBuilder sb = StringBuilder("Rezervare{");
        sb.append("tip='").append(tip).append('\'');
        sb.append(", pret='").append(pret).append('\'');
        sb.append(", ora='").append(ora);
        sb.append('{');
        
        return sb.toString();
        
    }
    
    public Rezervare copiaza() throws CloneNotSupportedException {
        
        return (Rezervare) super.clone();
        
    }
    
}