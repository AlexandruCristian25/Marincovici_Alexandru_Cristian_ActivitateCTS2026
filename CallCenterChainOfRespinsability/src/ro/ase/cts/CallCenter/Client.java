package ro.ase.cts.CallCenter;

public class Client {
    
    private String nume;
    private String nrTelefon;
    
    public Client(String nume, String nrTelefon) {
        
        super();
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        
    }
    
    public Client(String nume) {
        
        super();
        this.nume = nume;
        this.nrTelefon = null;
        
    }
    
    public String getNume() {
        
        return nume;
        
    }
    
    public void setNume(String nume) {
        
        this.nume = nume;
        
    }
    
    public String getNrTelefon() {
        
        return nrTelefon;
        
    }
    
    public void setNrTelefon(String nrTelefon) {
        
        this.nrTelefon = nrTelefon;
        
    }
    
}