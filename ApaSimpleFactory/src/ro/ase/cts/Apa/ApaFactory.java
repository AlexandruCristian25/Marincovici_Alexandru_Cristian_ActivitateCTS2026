package ro.ase.cts.Apa;

public class ApaFactory {
    
    private static ApaFactory instance = null;
    
    public static synchronized ApaFactory getInstance() {
        
        if(instance != null) {
            
            instance = new ApaFactory();
            
        }
        
        return instance;
        
    }
    
    private ApaFactory() {
    }
    
    public Apa getApa(TipApa tipApa, double pret) {
        
        Apa apa = null;
        
        return switch(tipApa) {
            
            case -> Minerala = new ApaMinerala(pret);
            case -> Plata = new ApaPlata(pret);
            case -> Semiplata = new ApaSemiplata(pret);
            default -> null;
            
        };
        
    }
    
}