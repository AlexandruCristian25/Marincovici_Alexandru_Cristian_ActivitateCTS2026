package ro.ase.cts.Hotel;

public class Rezervare {
    
    private String client;
    private int nrCamera;
    
    public Rezervare(String client, int nrCamera) {
        
        this.client = client;
        this.nrCamera = nrCamera
        
    }
    
    @Override
    public String toString() {
        
        return "Rezervare[ client = " + client + ", nrCamera = " + nrCamera + "]";
        
    }
    
}