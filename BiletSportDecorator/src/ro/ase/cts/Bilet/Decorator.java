package ro.ase.cts.Bilet;

import ro.ase.cts.Bilet.Bilet;

public abstract class Decorator implements IBilet {
    
    protected IBilet bilet;
    
    public Decorator(IBilet bilet) {
        this.bilet = bilet; 
    }
    
    @Override
    public void cumparaBilet() {
        bilet.cumparaBilet();
    }
    
}