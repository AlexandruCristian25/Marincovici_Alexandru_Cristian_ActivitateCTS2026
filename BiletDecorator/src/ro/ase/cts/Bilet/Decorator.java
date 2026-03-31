package ro.ase.cts.Bilet;

import ro.ase.cts.Factura.Factura;

public abstract class Decorator implements ro.ase.cts.Factura.IFactura {
    
    protected Bilet bilet;
    
    public Decorator(Bilet bilet) {
        
        this.bilet = bilet;
        
    }
    
    @Override
    public void afiseazaInfo() {
        
        bilet.afiseazaInfo();
        System.out.println("Bilet achizitionat");
        
    }
    
    public abstract void aplicareDiscount(int procent);
    
}