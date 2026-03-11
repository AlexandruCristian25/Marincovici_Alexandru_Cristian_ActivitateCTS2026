package ro.ase.cts.Animal;

public class AnimalFactory {
    
    public static Animal afiseazaAnimal(TipAnimal tipAnimal, String nume, int nrExemplare) {
        
        switch(tipAnimal) {
            
            case Elefant:
                return new Elefant(nume, nrExemplare);
            case Leu:
                return new Leu(nume, nrExemplare);
            case Pinguin:
                return new Pinguin(nume, nrExemplare);
            default:
                throw IllegalArgumentException("Tip animal inexistent: " + tipAnimal);
            
        }
        
    }
    
}
