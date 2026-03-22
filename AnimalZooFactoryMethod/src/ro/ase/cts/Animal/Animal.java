package ro.ase.cts.Animal;

public abstract class Animal {
    
    protected String nume;
    protected int nrExemplare;
    
    public Animal(String nume, int nrExemplare) {
        
        this.nume = nume;
        this.nrExemplare = nrExemplare;
        
    }
    
    public abstract void afiseazaInfo();
    

}
