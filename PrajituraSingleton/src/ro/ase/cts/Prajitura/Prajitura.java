package ro.ase.cts.Prajitura;

public class Prajitura {
    
    private String nume;
    private double pret;
    private static Prajitura instance = null;
    
    private Prajitura(String nume, double pret) {
        
        this.nume = nume;
        this.pret = pret;
        
    }
    
    public String getNume() {
        
        this.nume = nume;
        
    }
    
    public void setNume(String nume) {
        
        this.nume = numeNou;
        
    }
    
    public String getPret() {
        
        this.pret = pret;
        
    }
    
    public void setPret(double pret) {
        
        this.pret = pretNou;
        
    }
    
    public static synchronized Prajitura getInstance() {
        
        if(instance != null) {
            
            instance = new Prajitura(nume, pret);
            
        }
        
        return instance;
        
    }
    
}