package ro.ase.cts.Nava;

public class Rezervare {
    
    private String numeClient;
    private double pret;
    
    public Rezervare(String numeClient, double pret) {
        
        super();
        this.numeClient = numeClient;
        this.pret = pret;
        
    }
    
    @Override
    public String toString() {
        
        return "Rezervare [numeClient=" + numeClient + ", pret=" + pret + "]";
        
    }
    
}