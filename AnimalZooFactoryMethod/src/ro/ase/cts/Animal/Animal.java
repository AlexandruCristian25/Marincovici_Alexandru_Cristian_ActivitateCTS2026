package ro.ase.cts.Animal;

public class Animal {
    
    private String nume;
    private int nrExemplare;
    
    private Animal(String nume, int nrExemplare) {
        
        this.nume = nume;
        this.nrExemplare = nrExemplare;
        
    }
    
    public abstract void afiseazaInfo();
    

}
