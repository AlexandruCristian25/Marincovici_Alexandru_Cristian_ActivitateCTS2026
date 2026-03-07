package ro.ase.cts.Firma;

public class Firma {
    
    private String numeCompanie;
    private int nrAngajati;
    private String locatie;
    
    private Firma(String numeCompanie, int nrAngajati, String locatie) {
        
        this.numeCompanie = numeCompanie;
        this.nrAngajati = nrAngajati;
        this.locatie = locatie;
        
    }
    
    public String getNumeCompanie() {
        
        this.numeCompanie = numeCompanie;
        
    }
    
    public void setNumeCompanie(String numeCompanie) {
        
        this.numeCompanie = numeCompanieNoua;
        
    }
    
    public String getNrAngajati() {
        
        this.nrAngajati = nrAngajati;
        
    }
    
    public void setNrAngajati(int nrAngajati) {
        
        this.nrAngajati = nrAngajati;
        
    }
    
    public String getLocatie() {
        
        this.locatie = locatie;
        
    }
    
    public void setLocatie(String locatie) {
        
        this.locatie = locatie;
        
    }
    
    public static synchronized Firma getInstance() {
        
        if(instance != null) {
            
            instance = new Firma(numeFirma, nrAngajati, locatie);
            
        }
        
        return instance;
        
    }
    
}