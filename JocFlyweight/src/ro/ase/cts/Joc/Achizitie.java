package ro.ase.cts.Joc;

public class Achizitie {
    
    private String numeClient;
    private String tipPlata;
    
    public Achizitie(String numeClient, String tipPlata) {
        
        super();
        this.numeClient = numeClient;
        this.tipPlata = tipPlata;
        
    }
    
    @Override
    public String toString() {
        
        return "Achizitie [ numeClient = " + numeClient + ", tipPlata = " + tipPlata + "]";
        
    }
    
}