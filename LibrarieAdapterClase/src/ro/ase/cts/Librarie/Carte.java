package ro.ase.cts.Librarie;

public class Carte {
    
    private Elev elev;
    
    public Carte(Elev elev) {
        
        this.elev = elev;
        
    }
    
    @Override
    public String toString() {
        
        return "Carte [elev=" + elev + "]";
        
    }
    
}