package ro.ase.cts.Film;

public abstract class Film {

    protected int nrActori;
    protected double pretBilet;
    
    Film(int nrActori, double pretBilet) {
        
        this.nrActori = nrActori;
        this.pretBilet = pretBilet;
        
    }

    public abstract void afiseazaInfo();
    
}