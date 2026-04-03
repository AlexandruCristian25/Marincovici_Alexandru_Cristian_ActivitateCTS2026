package ro.ase.cts.Internare;

public class Pacinet implements IInternare {
    
    private String nume;
    private String nrTelefon;
    private String adresa;
    
    public Pacinet(String nume, String nrTelefon, String adresa) { // FIX constructor
        
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }
    
    @Override
    public void info(Pacient pacient) {
        System.out.println(this.toString() + " " + pacient);
    }
    
    @Override
    public String toString() {
        return "Pacient [nume=" + nume + ", nrTelefon=" + nrTelefon + ", adresa=" + adresa + "]";
    }
    
}