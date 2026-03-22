package ro.ase.cts.Hotel;

public class Rezervare {
    
    private String nume;
    private String email;
    private int nrPersoane;
    
    private Rezervare() {
    }
    
    public Rezervare(String nume, String email, int nrPersoane) {
        
        if(this.nume.length() > 3) {
            
            this.nume = nume;
            
        } else {
            
            this.nume = "NaN";
            
        }
        
        if(this.email.length() > 3) {
            
            this.email = email;
            
        } else {
            
            this.email = "NaN";
            
        }
        
        if(this.nrPersoane > 0) {
            
            this.nrPersoane = nrPersoane;
            
        }
        
    }
    
    public void setNrPersoane(int nrPersoane) {
        
        this.nrPersoane = nrPersoane;
        
    }
    
    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", nrTelefon='").append(nrPersoane);
        sb.append('{');
        
        return sb.toString();
        
    }
    
    public Rezervare copiaza() throws CloneNotSupportedException {
        
        return (Rezervare) super.clone();
        
    }
    
}