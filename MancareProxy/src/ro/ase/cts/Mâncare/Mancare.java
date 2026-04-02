package ro.ase.cts.Mancare;

public class Mancare {
    
    private String nume;
    private double pret;
    
    public Mancare(String nume, double pret) {
        
        super();
        this.nume = nume;
        this.pret = pret;
        
    }
    
    public String getNume() {
        
        return nume;
        
    }
    
    public void setNume(String nume) {
        
        this.nume = nume;
        
    }
    
    public double getPret() {
        
        return pret;
        
    }
    
    public void setPret(double pret) {
        
        this.pret = pret;
        
    }
    
    @Override
    public String toString() {
        
        return "Mancare [ nume = " + nume + " are pretul de " + pret + " lei]";
        
    }
    
}