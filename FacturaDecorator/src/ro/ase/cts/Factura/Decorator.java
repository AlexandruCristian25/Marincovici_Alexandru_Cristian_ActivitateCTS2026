package ro.ase.cts.Factura;

public abstract class Decorator implements ro.ase.cts.Factura.IFactura {
    
    protected Factura factura;
    
    public Decorator(Factura factura) {
        
        this.factura = factura;
        
    }
    
    @Override
    public void afiseazaDetalii() {
        
        factura.afiseazaDetalii();
        System.out.println("Multumim de cumparaturi");
        
    }
    
    public abstract void discountFactura(int procente);
    
}