package ro.ase.cts.Cabana;

public class MasinaInchiriata extends InchiriereMasina implements ICabana {
    
    public MasinaInchiriata(Masina masina) {
        
        super(masina);
        
    }
    
    @Override
    public void info() {
        
        System.out.println(super.toString());
        
    }
    
    @Override
    public void rezervareCabana() {
        
        super.masinaInchiriata();
        
    }
    
}