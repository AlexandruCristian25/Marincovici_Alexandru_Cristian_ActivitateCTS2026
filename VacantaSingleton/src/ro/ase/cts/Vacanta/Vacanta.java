package ro.ase.cts.Vacanta;

public class Vacanta {
    
    private String oras;
    private double pret;
    private int nrPersoane;
    private static Vacanta instance = null;
    
    private Vacanta(String oras, double pret, int nrPersoane) {
        
        this.oras = oras;
        this.pret = pret;
        this.nrPersoane = nrPersoane;
        
    }
    
    public String getOras() {
        
        this.oras = oras;
        
    }
    
    public void setOras(String oras) {
        
        this.oras = orasNou;
        
    }
    
    public String getPret() {
        
        this.pret = pret;
        
    }
    
    public void setPret(double pret) {
        
        this.pret = pretNou;
        
    }
    
    public String getNrPersoane() {
        
        this.nrPersoane = nrPersoane;
        
    }
    
    public void setNrPersoane(int nrPersoane) {
        
        this.nrPersoane = nrPersoaneNoi;
        
    }
    
    public static synchronized Vacanta getInstance() {
        
        if(instance != null) {
            
            instance = new Vacanta(oras, pret, nrPersoane);
            
        }
        
        return instance;
        
    }
    
}