package ro.ase.cts.Produs;

import ro.ase.cts.Produs.Produs;

public abstract class Decorator implements ro.ase.cts.Produs.Produs {
    
    protected Produs produs;
    
    public Deocrator(Produs produs) {
        
        this.produs = produs;
        
    }
    
    @Override
    public void afiseazaInfo() {
        
        produs.afiseazaInfo();
        System.out.println("Produs achizitionat");
        
    }
    
    public abstract void aplicaDiscount(int procent);
    
}