package ro.ase.cts.Tren;

public class Tren {
    
    private String marca;
    private int nrVagoane;
    
    private Tren(String marca, int nrVagoane) {
        
        this.marca = marca;
        this.nrVagoane = nrVagoane;
        
    }
    
    public static void afiseazaInfo();
    
}