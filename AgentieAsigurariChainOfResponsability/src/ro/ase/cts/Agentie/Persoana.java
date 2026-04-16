package ro.ase.cts.Agentie;

public class Persoana {
    
    private String nume;
    private String nrTelefon;
    private String email;
    
    public Persoana(String nume, String nrTelefon, String email) {
        super();
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.email = email;
    }
    
    public Persoana(String nume) {
        super();
        this.nume = nume;
        this.nrTelefon = null;
        this.email = null;
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
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
}