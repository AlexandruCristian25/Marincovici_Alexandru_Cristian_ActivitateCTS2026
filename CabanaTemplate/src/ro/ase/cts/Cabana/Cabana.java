package ro.ase.cts.Cabana;

public abstract class Cabana {
    
    protected String locatie;
    
    public Cabana(String locatie) {
        super();
        this.locatie = locatie;
    }
    
    public abstract void pachetCazare(String locatie);
    public abstract void rezervareCabana(String locatie);
    public abstract void achitarePachet(String locatie);
    
    public final void vindePachet() {
        
        pachetCazare(locatie);
        rezervareCabana(locatie);
        achitarePachet(locatie);
        
    }
}
