package ro.ase.cts.Cabana;

public class RezervaCabana extends Cabana {
    
    public RezervaCabana(String locatie) {
        
        super(locatie);
        
    }
    
    @Override
    public void pachetCazare(String locatie) {
        
        System.out.println("S-a gasit cabana pentru pachet in locatie " + locatie);
        
    }
    
    @Override
    public void rezervareCabana(String locatie) {
        
        System.out.println("Cabana a fost rezervata pentru locatia " + locatie);
        
    }
    
    @Override
    public void achitarePachet(String locatie) {
        
        System.out.println("Locatia cabanei este " + locatie);
        
    }
    
}