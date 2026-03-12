package ro.ase.cts.Carte;

public class CarteStiinta {
    
    public CarteStiinta(String autor, int nrPagini) {
        
        super(autor, nrPagini);
        
    }
    
    @Override
    public void afiseazaInfo() {
        
        System.out.println("Cartea de stiinta cu autorul " + autor + " are " + nrPagini + " pagini");
        
    }
    
}