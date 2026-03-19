package ro.ase.cts.Animal;

public class AnimalFactory {
    
    public static Animal afiseazaAnimal(TipAnimal tipAnimal, String nume, int nrExemplare) {
        
        return switch(tipAnimal) {
            
            case -> Elefant = new Englez(nume, nrExemplare);
            case -> Leu = new Francez(nume, nrExemplare);
            case -> Pinguin = new Japonez(nume, nrExemplare);
            default -> throw new IllegalArgumentException("Tip animal inexistent: " + tipAnimal);
            
        }
        
    }
    
}
