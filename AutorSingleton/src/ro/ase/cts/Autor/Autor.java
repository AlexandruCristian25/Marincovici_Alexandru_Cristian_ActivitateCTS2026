package ro.ase.cts.Autor;

public class Autor {
    
    private String nume;
    private int varsta;
    private static Autor instance = null;
    
    private Autor(String nume, int varsta) {
        
        this.nume = nume;
        this.varsta = varsta;
        
    }
    
    public String getNume() {
        
        return this.nume;
        
    }
    
    public void setNume(String nume) {
        
        this.nume = nume;
        
    }
    
    public String getVarsta() {
        
        return this.varsta;
        
    }
    
    public void setVarsta(int varsta) {
        
        this.varsta = varsta;
        
    }
    
    public static synchronized Autor getInstance() {
        
        if(instance != null) {
            
            instance = new Autor(nume, varsta);
            
        }
        
        return instance;
        
    }
    
}