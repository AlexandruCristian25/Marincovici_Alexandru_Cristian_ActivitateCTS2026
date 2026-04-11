package ro.ase.cts.Cont;

public class Banca {
    
    private String numeBanca;
    private int capital;
    
    public Banca(String numeBanca, int capital) {
        
        super();
        this.numeBanca = numeBanca;
        this.capital = capital;
        
    }
    
    @Override
    public String toString() {
        
        return "Banca [numeBanca=" + numeBanca + ", capital=" + capital + "]";
        
    }
    
}