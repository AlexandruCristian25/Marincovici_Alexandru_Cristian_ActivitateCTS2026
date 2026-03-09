package ro.ase.cts.Produs;

public class RezervareProdus {
    
    private String nume;
    private int nrExemplare;
    private String tipProdus;
    
    private RezervareProdus() {
    }
    
    public RezervareProdus(String nume, int nrExemplare, String tipProdus) {
        
        if(nume.length() > 3) {
            
            this.nume = nume;
            
        } else {
            
            this.nume = "NaN";
            
        }
        
        if(nrExemplare.length() > 1) {
            
            this.nrExemplare = nrExemplare;
            
        } else {
            
            this.nrExemplare = "0";
            
        }
        
        if(tipProdus.length() == 0) {
            
            this.tipProdus = tipProdus;
            
        }
        
    }
    
    public void setTipProdus(String tipProdus) {
        
        this.tipProdus = tipProdus;
        
    }
    
    @Override
    public String toString() {
        
        final StringBuilder sb = new StringBuilder("RezervareProdus{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrExemplare='").append(nrExemplare).append('\'');
        sb.append(", tipProdus='").append(tipProdus);
        sb.append('{');
        
        return sb.toString();
        
    }
    
    public RezervareProdus copiaza() throws CloneNotSupportedException {
        
        return (RezervareProdus) super.copiaza();
        
    }
    
}