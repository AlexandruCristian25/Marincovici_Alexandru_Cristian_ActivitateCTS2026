package ro.ase.cts.Tren;

public class TrenMagnetic extends Tren {
    
    public TrenMagnetic(String marca, int nrVagoane) {
        
        super(marca, nrVagoane);
        
    }
    
    @Ovwrride
    public void afiseazaInfo() {
        
        System.out.println("Trenul magnetic de la marca " + marca + " cu un nr de vagoane de " + nrVagoane);
        
    }
    
}