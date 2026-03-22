package ro.ase.cts.Animal;

public class AnimalFactory {
    
    public static Animal afiseazaAnimal(TipAnimal tipAnimal, String nume, int nrExemplare) {
        
        return switch(tipAnimal) {
            
            case Elefant -> new Elefant(nume, nrExemplare);
            case Leu -> new Leu(nume, nrExemplare);
            case Pinguin -> new Pinguin(nume, nrExemplare);
            default -> throw new IllegalArgumentException("Tip animal inexistent: " + tipAnimal);
            
        };

        
    }
    
}
