package ro.ase.cts.Bilet;

public class Bilet {
    
    private String numeClient;
    private double pret;
    
    public Bilet(String numeClient, double pret) {
        
        this.numeClient = numeClient;
        this.pret = pret;
        
    }
    
    public String getNumeClient() {
        
        return numeClient;
        
    }
    
    public void setNumeClient(String numeClient) {
        
        this.numeClient = numeClient;
        
    }
    
    public double getPret() {
        
        return pret;
        
    }
    
    public void setPret(double pret) {
        
        this.pret = pret;
        
    }
    
    @Override
    public String toString() {
        
        return "Bilet [numeClient=" + numeClient + ", pret=" + pret + "]";
        
    }
    
}