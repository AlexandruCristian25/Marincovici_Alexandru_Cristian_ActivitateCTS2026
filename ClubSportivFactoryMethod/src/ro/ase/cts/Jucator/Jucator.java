package ro.ase.cts.Jucator;

public abstract class Jucator {
    
    protected String nume;
    protected int nrMeciuri;
    
    Jucator(String nume, int nrMeciuri) {
        
        this.nume = nume;
        this.nrMeciuri = nrMeciuri;
        
    }
    
    public abstract void afiseazaInfo();
    
}