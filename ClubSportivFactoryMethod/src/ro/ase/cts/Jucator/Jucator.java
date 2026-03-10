package ro.ase.cts.Jucator;

public class Jucator {
    
    private String nume;
    private int nrMeciuri;
    
    private Jucator(String nume, int nrMeciuri) {
        
        this.nume = nume;
        this.nrMeciuri = nrMeciuri;
        
    }
    
    public static void afiseazaInfo();
    
}