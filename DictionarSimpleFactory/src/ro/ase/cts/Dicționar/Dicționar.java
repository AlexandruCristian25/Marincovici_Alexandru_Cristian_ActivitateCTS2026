package ro.ase.cts.Dictionar;

public abstract class Dictionar {
    
    protected String editura;
    protected double pret;
    
    private Dictionar(String editura, double pret) {
        
        this.editura = editura;
        this.pret = pret;
        
    }
    
    public abstract void afiseazaInfo();
    
}