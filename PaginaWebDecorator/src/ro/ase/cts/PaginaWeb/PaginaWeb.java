package ro.ase.cts.PaginaWeb;

public class PaginaWeb implements IPaginaWeb {
    
    private String nume;
    private int nrItems;
    
    public PaginaWeb(String nume, int nrItems) {
        
        super();
        this.nume = nume;
        this.nrItems = nrItems;
        
    }
    
    public String getNume() {
        
        return nume;
        
    }
    
    public void setNume(String nume) {
        
        this.nume = nume;
        
    }
    
    public int getNrItems() {
        
        return nrItems;
        
    }
    
    public void setNrItems(int nrItems) {
        
        this.nrItems = nrItems;
        
    }
    
    @Override
    public void afisarePagina() {
        
        System.out.println("Site-ul web " + nume + " are " + nrItems + " items");
        
    }
    
}