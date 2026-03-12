package ro.ase.cts.Carte;

public class CarteMatematica {
    
    public CarteMatematica(String autor, int nrPagini) {
        
        super(autor, nrPagini);
        
    }
    
    @Override
    public void afiseazaInfo() {
        
        System.out.println("Cartea de matematica cu autorul " + autor + " are " + nrPagini + " pagini");
        
    }
    
}