package ro.ase.cts.Masina;

public class Rezervare {
    
    private String numeSofer;
    private double pret;
    
    public Rezervare(String numeSofer, double pret) {
        
        super();
        this.numeSofer = numeSofer;
        this.pret = pret;
        
    }
    
    @Override
    public String toString() {
        
        return "Rezervare [numeSofer=" + numeSofer + ", pret=" + pret + "]";
        
    }
    
}