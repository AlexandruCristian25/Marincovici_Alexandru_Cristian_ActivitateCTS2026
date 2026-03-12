package ro.ase.cts.Carte;

public class CarteFizica {
    
    public CarteFizica(String autor, int nrPagini) {
        
        super(autor, nrPagini);
        
    }
    
    @Override
    public void afiseazaInfo() {
        
        System.out.println("Cartea de fizica cu autorul " + autor + " are " + nrPagini + " pagini");
        
    }
    
}