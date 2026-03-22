package ro.ase.cts.Tren;

public abstract class Tren {
    
    protected String marca;
    protected int nrVagoane;
    
    Tren(String marca, int nrVagoane) {
        
        this.marca = marca;
        this.nrVagoane = nrVagoane;
        
    }
    
    public abstract void afiseazaInfo();
    
}