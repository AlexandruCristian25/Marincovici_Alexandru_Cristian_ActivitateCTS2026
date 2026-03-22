package ro.ase.cts.Avion;

import static ro.ase.cts.Avion.TipAvion.Pasageri;

public class AvionFactory {
    
    public static AvionFa afiseazaAvion(TipAvion tip, String companie, int nrAngajati) {
        
        return switch(tip) {
            
            case Pasageri -> new Pasageri(companie, nrAngajati);
            case Marfa -> new Marfa(companie, nrAngajati);
            default -> throw new IllegalArgumentException("Tip avion inexistent: " + tip);
            
        };
        
    }
    
}