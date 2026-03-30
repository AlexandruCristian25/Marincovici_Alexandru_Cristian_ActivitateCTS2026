package ro.ase.cts.Animal;

public class ProxyAnimal implements IAnimal {
    
    private IAnimal animal;
    
    public ProxyAnimal(IAnimal animal) {
        
        this.animal = animal;
        
    }
    
    public ProxyAnimal(Animal animal) {
        
        this.animal = new IAnimal(animal);
        
    }
    
    @Override
    public void afisareInfo() {
        
        animal.afisareInfo();
        
    }
    
}
