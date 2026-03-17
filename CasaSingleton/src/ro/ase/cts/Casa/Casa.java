package ro.ase.cts.Casa;

public class Casa {
    
    private String locatie;
    private float suprafata;
    private static Casa instance = null;
    
    private Casa(String locatie, float pret) {
        
        this.locatie = locatie;
        this.suprafata = suprafata;
        
    }
    
    public String getLocatie() {
        
        return this.locatie;
        
    }
    
    public void setLocatie(String locatie) {
        
        this.locatie = locatie;
        
    }
    
    public float getSuprafata() {
        
        return this.suprafata;
        
    }
    
    public void setSuprafata(float suprafata) {
        
        this.suprafata = suprafata;
        
    }
    
    public void afiseazaDetaliiCasa() {
        
        StringBuilder sb = new StringBuilder();
        sb.append(this.locatie).append(this.suprafata);
        
        System.out.println(sb);
        
    }
    
    public static synchronized Casa getInstance(String locatie, float suprafata) {
        
        if(instance == null) {
            
            instance = new Casa(locatie, suprafata);
            
        }
        
        return instance;
        
    }
    
}