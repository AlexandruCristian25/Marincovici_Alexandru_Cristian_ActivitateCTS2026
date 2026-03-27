package ro.ase.cts.Main;

import ro.ase.cts.Animal.IAnimal;
import ro.ase.cts.Animal.Animal;
import ro.ase.cts.Animal.ProxyAnimal;

public class Main {
    public static void main(String[] args) {
        
        Animal animal = new Animal("Pisica", 10);
        
        AnimalProxy animalProxy = new AnimalProxy(animal);
        animalProxy.iAnimal();
        
    }
}