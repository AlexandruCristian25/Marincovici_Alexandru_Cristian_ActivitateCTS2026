package ro.ase.cts.Cabana;

public class InchiriereMasina {
    
    private Masina masina;
    
    public InchiriereMasina(Masina masina) {
        
        this.masina = masina;
        
    }
    
    public void masinaInchiriata() {
        
        System.out.println("A fost inchiriata masina " + masina.toString());
        
    }
    
    @Override
    public String toString() {
        
        return "InchiriereMasina [masina=" + masina + "]";
        
    }
    
}