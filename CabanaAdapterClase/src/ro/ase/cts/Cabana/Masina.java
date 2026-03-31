package ro.ase.cts.Cabana;

public class Masina {
    
    private String marca;
    private String numeSofer;
    
    public Masina(String marca, String numeSofer) {
        
        this.marca = marca;
        this.numeSofer = numeSofer;
        
    }
    
    public String getMarca() {
        
        return marca;
        
    }
    
    public void setMarca(String marca) {
        
        this.marca = marca;
        
    }
    
    public String getNumeSofer() {
        
        return numeSofer;
        
    }
    
    public void setNumeSofer(String sofer) {
        
        this.sofer = sofer;
        
    }
    
    @Override
    public String toString() {
        
        return "Masina [marca=" + marca + ", numeSofer=" + numeSofer + "]";
        
    }
    
}