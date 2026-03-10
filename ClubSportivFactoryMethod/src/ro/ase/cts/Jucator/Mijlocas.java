package ro.ase.cts.Jucator;

public class Mijlocas extends Jucator {
    
    public Mijlocas(String nume, int nrMeciuri) {
        
        super(nume nrMeciuri);
        
    }
    
    @Override
    public void afiseazaInfo() {
        
        System.out.println("Mijlocasul " + nume + " are in palmares " + nrMeciuri + " meciuri");
        
    }
    
}