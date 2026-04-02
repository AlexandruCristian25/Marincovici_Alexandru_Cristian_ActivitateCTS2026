package ro.ase.cts.Cabana;

public abstract class Cabana {
    
    protected String locatie;
    
    public Cabana(String locatie, boolean areEtaj) {
        
        super();
        this.locatie = locatie;
        this.areEtaj = areEtaj;
        
    }
    
    public abstract void cautareCazare(String locatie);
    public abstract void rezervareCabana(String locatie);
    public abstract void achitarePachet(String locatie);
    
    public final void vindePachet() {
        
        cautareCazare(locatie);
        rezervareCabana(locatie);
        achitarePachet(locatie);
        
    }
    
}