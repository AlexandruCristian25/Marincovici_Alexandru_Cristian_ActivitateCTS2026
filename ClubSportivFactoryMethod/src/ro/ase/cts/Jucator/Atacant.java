package ro.ase.cts.Jucator;

public class Atacant extends Jucator {
    
    public Atacant(String nume, int nrMeciuri) {
        
        this.nume = nume;
        this.nrMeciuri = nrMeciuri;
        
    } 
    
    @Override
    public void afiseazaInfo() {
        
        System.out.println("Atacantul " + nume + " are in palmares " + nrMeciuri + " meciuri");
        
    }
    
}