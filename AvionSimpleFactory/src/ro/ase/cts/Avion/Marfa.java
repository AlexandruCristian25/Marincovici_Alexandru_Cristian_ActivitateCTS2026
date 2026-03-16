package ro.ase.cts.Avion;

public class Marfa extends Avion {
    
    public Marfa(String companie, int nrAngajati) {
        
        super(companie, nrAnagajati);
        
    }
    
    @Override
    public void afiseazaInfo() {
        
        StringBuilder sb = new StringBuilder();
        sb.append("Avionul de marfa este de la compania: Companie: ");
        sb.append("Nr angajati: ").append(nrAngajati);
        
        System.out.println(sb.toString());
        
    }
    
}