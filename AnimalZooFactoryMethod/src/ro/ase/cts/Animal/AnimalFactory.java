package ro.ase.cts.Animal;

public class AnimalFactory {
    
    public static Animal afiseazaAnimal(TipAnimal tipAnimal, String nume, int nrExemplare) {
        
        switch(tipAnimal) {
            
            case Elefant:
                return Elefant(nume, nrExemplare);
            case Leu:
                return Leu(nume, nrExemplare);
            case Pinguin:
                return Pinguin(nume, nrExemplare);
            default:
                throw IllegalArgumentException("Tip animal inexistent: " + tipAnimal);
            
        }
        
    }
    
}