package ro.ase.cts.Main;

import ro.ase.cts.Animal.Animal;

public class Main {
    
    public static void main(String[] args) {
        
        Animal a1 = AnimalFactory.afiseazaAnimal(tipAnimal.Elefant, "Elefant", 6);
        Animal a2 = AnimalFactory.afiseazaAnimal(tipAnimal.Leu, "Leu", 9);
        Animal a3 = AnimalFactory.afiseazaAnimal(tipAnimal.Pinguin, "Pinguin", 13);
        
        a1.afiseazaInfo();
        a2.afiseazaInfo();
        a3.afiseazaInfo();
        
    }
    
}