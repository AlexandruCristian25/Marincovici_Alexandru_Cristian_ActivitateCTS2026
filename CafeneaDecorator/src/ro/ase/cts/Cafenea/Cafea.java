package ro.ase.cts.Cafenea;

public class Cafea implements ICafea {
    
    private String nume;
    private double pret;
    
    public Cafea(String nume, double pret) {
        
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
    public void vindeCafea() {
        
        System.out.println("Cafeaua cu numele " + nume + " are pretul de " + pret + " lei");
        
    }
    
}