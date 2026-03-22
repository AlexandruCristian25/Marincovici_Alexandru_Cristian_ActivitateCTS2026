package ro.ase.cts.Vacanta;

public abstract class Vacanta {
    
    protected String locatie;
    protected double pret;
    protected int nrPersoane;
    
    public Vacanta(String locatie, double pret, int nrPersoane) {
        
        this.locatie = locatie;
        this.pret = pret;
        this.nrPersoane = nrPersoane;
        
    }
    
    public abstract void afiseazaInfo();

}