package ro.ase.cts.Vacanta;

public abstract class Vacanta {
    
    private String locatie;
    private double pret;
    private int nrPersoane;
    
    private Vacanta(String locatie, double pret, int nrPersoane) {
        
        this.locatie = locatie;
        this.pret = pret;
        this.nrPersoane = nrPersoane;
        
    }
    
    public abstract void afiseazaInfo();
    
}