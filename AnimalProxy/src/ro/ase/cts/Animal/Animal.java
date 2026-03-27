package ro.ase.cts.Animal;

public class Animal {
    
    private String nume;
    private int nrExemplare;
    
    public Animal(String nume, int nrExemplare) {
        
        super();
        this.nume = nume;
        this.nrExemplare = nrExemplare;
        
    }
    
    public String getNume() {
        
        return nume;
        
    }
    
    public void setNume(String nume) {
        
        this.nume = nume;
        
    }
    
    public int getNrExemplare() {
        
        return nrExemplare;
        
    }
    
    public void setNrExemplare(int nrExemplare) {
        
        this.nrExemplare = nrExemplare;
        
    }
    
    @Override
    public String toSting() {
        
        return "Animal[ nume = " + nume + ", nrExemplare = " + nrExemplare + "]";
        
    }
    
}