package ro.ase.cts.Vacanta;

public class Gratuita extends Vacanta {
    
    public Gratuita(String locatie, double pret, int nrPersoane){
        
        super(locatie, pret, nrPersoane);
        
    }
    
    @Override
    public void afiseazaInfo() {
        
        StringBuilder sb = new StringBuilder();
        sb.append("Locatie vacanta: Locatie: ").append(locatie);
        sb.append("Pret: ").append(locatie);
        sb.append("Nr persoane: ").append(nrPersoane);
        
        System.out.println(sb.toString());
        
    }
    
}