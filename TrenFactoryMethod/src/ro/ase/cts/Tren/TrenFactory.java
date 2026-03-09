package ro.ase.cts.Tren;

public class TrenFactory {
    
    public static Tren creeazaTren(TipTren tipTren, String marca, int nrVagoane) {
        
        switch(tipTren) {
            
            case TrenElectric:
                return TrenElectric(marca, nrVagoane);
            case TrenCrabuni:
                return TrenCrabuni(marca, nrVagoane);
            case TrenMagnetic:
                return TrenMagnetic(marca, nrVagoane);
            default:
                throw IllegalArgumentException("Tip tren inexistent: " + tipTren);
            
        }
        
    }
    
}