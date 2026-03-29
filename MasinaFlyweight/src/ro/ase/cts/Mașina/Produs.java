package ro.ase.cts.Magazin;

public class Produs {
    
    private String numeProdus;
    private int codProdus;
    
    public Produs(String numeProdus, int codProdus) {
        
        super();
        this.numeProdus = numeProdus;
        this.codProdus = codProdus;
        
    }
    
    @Override
    public String toString() {
        
        return "Produs [ numeProdus = " + numeProdus + ", codProdus = " + codProdus + "]";
        
    }
    
}