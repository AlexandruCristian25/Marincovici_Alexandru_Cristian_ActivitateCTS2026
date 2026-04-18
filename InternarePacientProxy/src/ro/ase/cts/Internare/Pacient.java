package ro.ase.cts.Internare;

public class Pacient {
    
    private String nume;
    private String nrTelefon;
    
    public Pacient(String nume, String nrTelefon) {
        
        super();
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        
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
    
    @Override
    public String toString() {
        
        return "Pacient [nume=" + nume + ", nrTelefon=" + nrTelefon + "]";
        
    }
    
}