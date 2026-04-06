package ro.ase.cts.Aplicatie;

public class Utilizator {
    
    private String nume;
    private String email;
    private String parola;
    
    public Utilizator(String nume, String email, String parola) {
        super();
        this.nume = nume;
        this.email = email;
        this.parola = parola;
    }
    
    public Utilizator(String nume) {
        super();
        this.nume = nume;
        this.email = null;
        this.parola = null;
    }
    
    public String getNume() {
        return nume;
    }
    
    public void setNume(String nume) {
        this.nume = nume;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getParola() {
        return parola;
    }
    
    public void setParola(String parola) {
        this.parola = parola;
    }
    
}