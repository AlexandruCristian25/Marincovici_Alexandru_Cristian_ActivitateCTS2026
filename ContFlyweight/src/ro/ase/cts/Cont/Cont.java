package ro.ase.cts.Cont;

public class Cont implements ICont {
    
    private String nume;
    private String nrTelefon;
    private String email;
    
    public Cont(String nume, String nrTelefon, String email) {
        
        super();
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.email = email;
        
    }
    
    @Override
    public void detalii(Banca banca) {
        
        System.out.println(this.toString() + " " + banca.toString());
        
    }
    
    @Override
    public String toString() {
        
        return "Cont [nume=" + nume + ", nrTelefon=" + nrTelefon + ", email=" + email + "]";
        
    }
    
}