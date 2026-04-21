package ro.ase.cts.Barca;

public class Rezervare {
    
    private String client;
    private double suma;
    
    public Rezervare(String client, double suma) {
        
        super();
        this.client = client;
        this.suma = suma;
        
    }
    
    @Override
    public String toString() {
        
        return "Rezervare [client=" + client + ", suma=" + suma + "]";
        
    }
    
}