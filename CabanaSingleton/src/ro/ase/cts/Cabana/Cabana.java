package ro.ase.cts.Cabana;

public class Cabana {
    
    private String locatie;
    private int nrCamere;
    private static Cabana instance = null;
    
    public Cabana(String locatie, int nrCamere) {
        
        this.locatie = locatie;
        this.nrCamere = nrCamere;
        
    }
    
    public String getLocatie() {
        
        return this.locatie;
        
    }
    
    public void setLocatie(String locatie) {
        
        this.locatie = locatie;
        
    }
    
    public int getNrCamere() {
        
        return this.nrCamere;
        
    }
    
    public void setNrCamere(int nrCamere) {
        
        this.nrCamere = nrCamere;
        
    }
    
    public static synchronized Cabana getInstance(String locatie, int nrCamere) {
        
        if(instance == null) {
            
            instance = new Cabana(locatie, nrCamere);
            
        }
        
        return instance;
        
    }
    
    public void afisareDetaliiCabana() {
        
        StringBuilder sb = new StringBuilder();
        sb.append(this.locatie).append(this.nrCamere);
        
        System.out.println(sb);
        
    }
    
}