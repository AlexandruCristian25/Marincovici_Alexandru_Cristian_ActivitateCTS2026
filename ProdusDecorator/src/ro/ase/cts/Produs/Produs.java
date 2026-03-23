package ro.ase.cts.Produs;

public class Produs implements IProdus {
    
    private String nume;
    private double pret;
    
    public Produs(String nume, double pret) {
        
        super();
        this.nume = nume;
        this.pret = pret;
        
    }
    
    public void afiseazaInfo() {
        
        System.out.println("Produsul cu numele " + nume + " are pretul de " + pret + " lei");
        
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
    
}