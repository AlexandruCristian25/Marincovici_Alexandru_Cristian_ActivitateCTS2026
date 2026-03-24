package ro.ase.cts.Companie;

public class TipCompanie implements ICompanie {
    
    private Companie companie;
    
    public Companie getCompanie() {
        
        return companie;
        
    }
    
    public void setNume(String nume) {
        
        this.nume = nume;
        
    }
    
    public void setLocatie(String locatie) {
        
        this.locatie = locatie;
        
    }
    
    @Override
    public void descriere() {
        
        System.out.println("Compania este la locatia X");
        
    }
    
    @Override
    public void creazaBirou() {
        
        System.out.println(companie.getNume() + " a construit un nou birou");
        
    }
    
}