package ro.ase.cts.Cinematograf;

public class Cinematograf {
    
    private String adresa;
    private int nrLocuri;
    private int nrFilme;
    
    private static Cinematograf instance = null;
    
    private Cinematograf(String adresa, int nrLocuri, int nrFilme) {
        this.adresa = adresa;
        this.nrLocuri = nrLocuri;
        this.nrFilme = nrFilme;
    }
    
    public String getAdresa() {
        return adresa;
    }
    
    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
    
    public int getNrLocuri() {
        return nrLocuri;
    }
    
    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }
    
    public int getNrFilme() {
        return nrFilme;
    }
    
    public void setNrFilme(int nrFilme) {
        this.nrFilme = nrFilme;
    }
    
    public static synchronized Cinematograf getInstance(String adresa,
    int nrLocuri, int nrFilme) {
        
        if(instance == null) {
            
            instance = new Cinematograf(adresa, nrLocuri, nrFilme);
            
        }
        
        return instance;
        
    }
    
}
