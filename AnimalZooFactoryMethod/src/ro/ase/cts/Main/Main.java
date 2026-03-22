package ro.ase.cts.Main;

import ro.ase.cts.Animal.Animal;
import ro.ase.cts.Animal.AnimalFactory;
import ro.ase.cts.Animal.TipAnimal;

public class Main {
    
    public static void main(String[] args) {
        
        AnimalFactory animalFactory = new AnimalFactory();
        
        Animal a1 = animalFactory.afiseazaAnimal(TipAnimal.Elefant, "Elefant", 6);
        Animal a2 = animalFactory.afiseazaAnimal(TipAnimal.Leu, "Leu", 9);
        Animal a3 = animalFactory.afiseazaAnimal(TipAnimal.Pinguin, "Pinguin", 13);
        
        a1.afiseazaInfo();
        a2.afiseazaInfo();
        a3.afiseazaInfo();
        
    }
    
}
