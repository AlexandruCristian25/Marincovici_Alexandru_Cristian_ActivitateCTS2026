package ro.ase.cts.Carte;

public abstract class Carte {
    
    protected String autor;
    protected int nrPagini;
    
    Carte(String autor, int nrPagini) {
        
        this.autor = autor;
        this.nrPagini = nrPagini;
        
    }
    
    public abstract void afiseazaInfo();
    
}
