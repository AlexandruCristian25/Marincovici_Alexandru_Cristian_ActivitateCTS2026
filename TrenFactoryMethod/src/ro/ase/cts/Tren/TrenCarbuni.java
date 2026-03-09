package ro.ase.cts.Tren;

public class TrenCarbuni extends Tren {
    
    public TrenCarbuni(String marca, int nrVagoane) {
        
        super(marca, nrVagoane);
        
    }
    
    @Ovwrride
    public void afiseazaInfo() {
        
        System.out.println("Trenul cu carbuni de la marca " + marca + " cu un nr de vagoane de " + nrVagoane);
        
    }
    
}