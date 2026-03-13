package ro.ase.cts.Vacanta;

public class PartialPlatita {
    
    public PartialPlatita(String locatie, double pret, int nrPersoane) {
        
        super(locatie, pret, nrPersoane);
        
    }
    
    @Override
    public void afiseazaInfo() {
        
        StringBuider sb = new StringBuilder();
        sb.append("Locatie vacanta: Locatie: ").append(locatie);
        sb.append("Pret: ").append(pret);
        sb.append("Nr persoane: ");
        
        System.out.pritnln(sb.toString());
        
    }
    
}