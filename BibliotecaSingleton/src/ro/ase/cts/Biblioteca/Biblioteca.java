package ro.ase.cts.Biblioteca;

public class Biblioteca {
    
    private String locatie;
    private int nrCarti;
    private static Biblioteca instance = null;
    
    private Biblioteca(String locatie, int nrCarti) {
        
        this.locatie = locatie;
        this.nrCarti = nrCarti;
        
    }
    
    public String getLocatie() {
        
        this.locatie = locatie;
        
    }
    
    public void setLocatie(String locatie) {
        
        this.locatie = locatieNoua;
        
    }
    
    public int getNrCarti() {
        
        this.nrCarti = nrCarti;
        
    }
    
    public void setNrCarti(int nrCarti) {
        
        this.nrCarti = nrCartiNoi;
        
    }
    
    public static synchronized Biblioteca getInstance() {
        
        if(instance != null) {
            
            instance = new Biblioteca(locatie, nrCarti);
            
        }
        
        return instance;
        
    }
    
}