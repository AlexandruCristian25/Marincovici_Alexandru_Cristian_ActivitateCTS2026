package ro.ase.cts.Ciocolata;

public abstract class Ciocolata {
    
    private String nume;
    private double pret;
    
    private Ciocolata(String nume, double pret) {
        
        this.nume = nume;
        this.pret = pret;
        
    }
    
    public abstract void afiseazaInfo();
    
}