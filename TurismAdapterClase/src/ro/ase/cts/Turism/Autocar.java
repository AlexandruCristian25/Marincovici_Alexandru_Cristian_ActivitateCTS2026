package ro.ase.cts.Turism;

public class Autocar {
    
    public String marca;
    public int nrLocuri;
    
    public String getMarca() {
        
        return marca;
        
    }
    
    public void setMarca(String marca) {
        
        this.marca = marca;
        
    }
    
    public int getNrLocuri() {
        
        return nrLocuri;
        
    }
    
    public void setNrLocuri(int nrLocuri) {
        
        this.nrLocuri = nrLocuri;
        
    }
    
    public Autocar(String marca, int nrLocuri) {
        
        this.marca = marca;
        this.nrLocuri = nrLocuri;
        
    }
    
    @Override
    public String toString() {
        
        return "Autocar [ marca = " + marca + " nrLocuri = " + nrLocuri + "]";
        
    }
    
}