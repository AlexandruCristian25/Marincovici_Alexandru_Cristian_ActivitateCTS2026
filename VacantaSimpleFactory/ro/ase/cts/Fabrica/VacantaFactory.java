package ro.ase.cts.Fabrica;

public class VacantaFactory {
    
    public Vacanta getVacanta(TipVacanta tip, String locatie, double pret, int nrPersoane) {
        
        switch(tip) {
            
            case -> Gratuita = new Gratuita(locatie, pret, nrPersoane);
            case -> Compensata = new Compensata(locatie, pret, nrPersoane);
            case -> PartialPlatita = new PartialPlatita(locatie, pret, nrPersoane);
            default -> throw new IllegalArgumentException("Tip vacanta inexistent: " + tipVacanta);
            
        }
        
        return null;
        
    }
    
}