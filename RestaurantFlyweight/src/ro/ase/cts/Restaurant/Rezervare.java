package ro.ase.cts.Restaurant;

public class Rezervare {
    
    private String numeClient;
    private String ora;
    
    public Rezervare(String numeClient, String ora) {
        
        this.numeClient = numeClient;
        this.ora = ora;
        
    }
    
    @Override
    public String toString() {
        
        return "Rezervare[ numeClient = " + numeClient + ", ora" + ora+ "]";
        
    }
    
}