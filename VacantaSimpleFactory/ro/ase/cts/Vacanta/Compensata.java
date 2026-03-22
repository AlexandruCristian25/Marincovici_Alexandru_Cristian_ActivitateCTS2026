package ro.ase.cts.Vacanta;

public class Compensata extends Vacanta {
    
    public Compensata(String locatie, double pret, int nrPersoane) {
        
        super(locatie, pret, nrPersoane);
        
    }
    
    @Override
    public void afiseazaInfo() {

        StringBuilder sb = new StringBuilder();
        sb.append("Locatie vacanta: Locatie: ").append(locatie);
        sb.append("Pret: ").append(pret);
        sb.append("Nr persoane: ").append(nrPersoane);
        
        System.out.println(sb.toString());
        
    }
    
}