package ro.ase.cts.Firma;

public class Firma {
    
    private static String numeCompanie;
    private static int nrAngajati;
    private static String locatie;
    private static Firma instance = null;
    
    private Firma(String numeCompanie, int nrAngajati, String locatie) {
        
        this.numeCompanie = numeCompanie;
        this.nrAngajati = nrAngajati;
        this.locatie = locatie;
        
    }
    
    public String getNumeCompanie() {
        
        return this.numeCompanie;
        
    }
    
    public void setNumeCompanie(String numeCompanie) {
        
        this.numeCompanie = numeCompanie;
        
    }
    
    public int getNrAngajati() {
        
        return this.nrAngajati;
        
    }
    
    public void setNrAngajati(int nrAngajati) {
        
        this.nrAngajati = nrAngajati;
        
    }
    
    public String getLocatie() {
        
        return this.locatie;


    }
    
    public void setLocatie(String locatie) {
        
        this.locatie = locatie;
        
    }
    
    public static synchronized Firma getInstance() {
        
        if(instance == null) {
            
            instance = new Firma(numeCompanie, nrAngajati, locatie);
            
        }
        
        return instance;
        
    }

}