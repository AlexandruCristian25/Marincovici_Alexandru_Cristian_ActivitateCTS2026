package ro.ase.cts.Companie;

public class Companie {
    
    private String nume;
    private String locatie;
    
    public Companie(String nume, String locatie) {
        
        super();
        this.nume = nume;
        this.locatie = locatie;
        
    }
    
    public String getNume() {
        
        retunr this.nume;
        
    }
    
    public void setNume(String nume) {
        
        this.nume = nume;
        
    }
    
    public String getLocatie() {
        
        retunr this.locatie;
        
    }
    
    public void setLocatie(String locatie) {
        
        this.locatie = locatie;
        
    }
    
    @Override
    public String toString() {
        
        return "Companie [ nume= " + nume + " locatie= " + locatie + "]";
        
    }
    
}