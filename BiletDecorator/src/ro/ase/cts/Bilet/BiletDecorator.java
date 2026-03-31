package ro.ase.cts.Bilet;

import ro.ase.cts.Factura.Factura;

public class BiletDecorator extends Decorator {
    
    public BiletDecorator(Bilet bilet) {
        
        super(bilet);
        
    }
    
    @Overide
    public void aplicareDiscount(int procent) {
        
        super.bilet.setNume(super.bilet.getNume() * (100 - procent) / 100);
        
    }
    
}