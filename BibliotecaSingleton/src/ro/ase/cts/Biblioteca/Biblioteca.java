package ro.ase.cts.Biblioteca;

public class Biblioteca {
    
    private static String locatie;
    private static int nrCarti;
    private static Biblioteca instance = null;
    
    private Biblioteca(String locatie, int nrCarti) {
        
        this.locatie = locatie;
        this.nrCarti = nrCarti;
        
    }
    
    public String getLocatie() {
        
        return this.locatie;
        
    }
    
    public void setLocatie(String locatie) {
        
        this.locatie = locatie;
        
    }
    
    public int getNrCarti() {
        
        return this.nrCarti;
        
    }
    
    public void setNrCarti(int nrCarti) {
        
        this.nrCarti = nrCarti;
        
    }
    
    public static synchronized Biblioteca getInstance() {
        
        if(instance == null) {
            
            instance = new Biblioteca(locatie, nrCarti);
            
        }
        
        return instance;
        
    }
    
}