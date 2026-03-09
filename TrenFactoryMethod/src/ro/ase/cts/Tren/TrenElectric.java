package ro.ase.cts.Tren;

public class TrenElectric extends Tren {
    
    public TrenElectric(String marca, int nrVagoane) {
        
        super(marca, nrVagoane);
        
    }
    
    @Ovwrride
    public void afiseazaInfo() {
        
        System.out.println("Trenul electric de la marca " + marca + " cu un nr de vagoane de " + nrVagoane);
        
    }
    
}