package ro.ase.cts.Bilet;

import ro.ase.cts.Bilet.Bilet;

public class BiletDecorator extends Decorator {
    
    public BiletDecorator(IBilet bilet) {
        super(bilet);
    }
    
    @Override
    public void cumparaBilet() {
        super.cumparaBilet();
        System.out.println("Va mai asteptam!");
    }
    
}