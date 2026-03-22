package ro.ase.cts.Tren;

public class TrenFactory {
    
    public static Tren creeazaTren(TipTren tipTren, String marca, int nrVagoane) {
        
        return switch(tipTren) {
            
            case TrenElectric -> new TrenElectric(marca, nrVagoane);
            case TrenCarbuni -> new TrenCarbuni(marca, nrVagoane);
            case TrenMagnetic -> new TrenMagnetic(marca, nrVagoane);
            default -> throw new IllegalArgumentException("Tip tren inexistent: " + tipTren);
            
        };
        
    }
    
}