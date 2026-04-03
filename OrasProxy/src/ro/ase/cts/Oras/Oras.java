package ro.ase.cts.Oras;

public class Oras {
    
    private String nume;
    private String tara;
    
    public Oras(String nume, String tara) {
        
        super();
        this.nume = nume;
        this.tara = tara;
        
    }
    
    public String getNume() {
        
        return nume;
        
    }
    
    public void setNume(String nume) {
        
        this.nume = nume;
        
    }
    
    public String getTara() {
        
        return tara;
        
    }
    
    public void setTara(String tara) {
        
        this.tara = tara;
        
    }
    
    @Override
    public String toString() {
        
        return "Oras [ nume = " + nume + ", tara = " + tara + "]";
        
    }
    
}