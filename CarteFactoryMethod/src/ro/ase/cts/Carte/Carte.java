package ro.ase.cts.Carte;

public class Carte {
    
    private String autor;
    private int nrPagini;
    
    private Carte(String autor, int nrPagini) {
        
        this.autor = autor;
        this.nrPagini = nrPagini;
        
    }
    
    public abstract void afiseazaInfo();
    
}
