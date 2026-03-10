package ro.ase.cts.Jucator;

public class Portar extends Jucator {
    
    public Portar(String nume, int nrMeciuri) {
        
        super(nume, nrMeciuri);
        
    }
    
    @Override
    public void afiseazaInfo() {
        
        System.out.println("Portarul " + nume + " are in palmares " + nrMeciuri + " meciuri");
        
    }
    
}