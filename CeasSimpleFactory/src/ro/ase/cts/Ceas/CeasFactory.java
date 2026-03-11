package ro.ase.cts.Ceas;

public class CeasFactory {
    
    private static CeasFactory instance = null;
    
    public static synchronized CeasFactory getInstance() {
        
        if(instance != null) {
            
            instance = new CeasFactory();
            
        }
        
        return instance;
        
    }
    
    public Ceas getCeas(TipCeas tipCeas, int nrBucati) {
        
        Ceas ceas = null;
        
        return switch(tipCeas) {
            
            case -> Mecanic = new Mecanic(nrBucati);
            case -> Automat = new Automat(nrBucati);
            case -> Digital = new Digital(nrBucati);
            default -> null;
            
        }
        
    }
    
}