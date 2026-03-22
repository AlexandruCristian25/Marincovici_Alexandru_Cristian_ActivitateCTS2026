package ro.ase.cts.Fabrica;

import ro.ase.cts.Vacanta.Compensata;
import ro.ase.cts.Vacanta.Gratuita;
import ro.ase.cts.Vacanta.PartialPlatita;
import ro.ase.cts.Vacanta.Vacanta;

public class VacantaFactory {
    
    public Vacanta getVacanta(TipVacanta tip, String locatie, double pret, int nrPersoane) {

        return switch(tip) {
            
            case Gratuita -> new Gratuita(locatie, pret, nrPersoane);
            case Compensata -> new Compensata(locatie, pret, nrPersoane);
            case PartialPlatita -> new PartialPlatita(locatie, pret, nrPersoane);
            default -> throw new IllegalArgumentException("Tip vacanta inexistent: " + tip);
            
        };

    }
    
}