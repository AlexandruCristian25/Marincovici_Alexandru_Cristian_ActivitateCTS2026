package ro.ase.cts.Prajitura;

public class Prajitura {
    
    private static String nume;
    private static double pret;
    private static Prajitura instance = null;
    
    private Prajitura(String nume, double pret) {
        
        this.nume = nume;
        this.pret = pret;
        
    }
    
    public String getNume() {
        
        return this.nume;
        
    }
    
    public void setNume(String nume) {
        
        this.nume = nume;
        
    }
    
    public double getPret() {
        
        return this.pret;
        
    }
    
    public void setPret(double pret) {
        
        this.pret = pret;
        
    }
    
    public static synchronized Prajitura getInstance() {
        
        if(instance == null) {
            
            instance = new Prajitura(nume, pret);
            
        }
        
        return instance;
        
    }
    
}