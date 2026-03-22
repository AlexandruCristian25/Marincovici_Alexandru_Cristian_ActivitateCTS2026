package ro.ase.cts.Vacanta;

public class PartialPlatita extends Vacanta{
    
    public PartialPlatita(String locatie, double pret, int nrPersoane) {
        
        super(locatie, pret, nrPersoane);
        
    }
    
    @Override
    public void afiseazaInfo() {
        
        StringBuilder sb = new StringBuilder();
        sb.append("Locatie vacanta: Locatie: ").append(locatie);
        sb.append("Pret: ").append(pret);
        sb.append("Nr persoane: ");
        
        System.out.println(sb.toString());
        
    }
    
}