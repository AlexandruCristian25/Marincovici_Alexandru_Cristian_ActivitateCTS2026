package ro.ase.cts.Avion;

public abstract class Avion {
    
    private String companie;
    private int nrAngajati;
    
    private Avion(String companie, int nrAngajati) {
        
        this.companie = companie;
        this.nrAngajati = nrAngajati;
        
    }
    
    public abstract void afiseazaInfo();
    
}