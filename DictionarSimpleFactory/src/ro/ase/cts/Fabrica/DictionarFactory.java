package ro.ase.cts.Fabrica;

public class DictionarFactory {
    
    public Dictionar getDictionar(TipDictionar tip, String editura, double pret) {
        
        return switch(tip) {
            
            case -> Englez = new Englez(editura, pret);
            case -> Francez = new Francez(editura, pret);
            case -> Japonez = new Japonez(editura, pret);
            default -> throw new IllegalArgumentException("Tip dictionar inexistent: " + tip);
            
        }
        
        return null;
        
    }
    
}