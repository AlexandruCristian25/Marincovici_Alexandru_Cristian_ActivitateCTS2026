package ro.ase.cts.Avion;

public class AvionFactory {
    
    public Avion avion(TipAvion tip, String companie, int nrAngajati) {
        
        return switch(tip) {
            
            case -> Pasageri = new Pasageri(companie, nrAnagajati);
            case -> Marfa = new Marfa(companie, nrAnagajati);
            default -> throw new IllegalArgumentException("Tip avion inexistent: " + tipAvion);
            
        }
        
        return null;
        
    }
    
}