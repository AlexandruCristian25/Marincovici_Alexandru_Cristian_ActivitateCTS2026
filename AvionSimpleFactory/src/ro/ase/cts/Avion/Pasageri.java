package ro.ase.cts.Avion;

public class Pasageri extends Avion{
    
    public Pasageri(String companie, int nrAngajati) {
        
        super(companie, nrAngajati);
        
    }
    
    @Override
    public void afisareInfo() {
        
        StringBuilder sb = new StringBuilder();
        sb.append("Avionul de pasageri este de la compania: Companie: ").append(super.companie);
        sb.append("Nr angajati").append(super.nrAngajati);
        
        System.out.println(sb.toString());
        
    }
    
}