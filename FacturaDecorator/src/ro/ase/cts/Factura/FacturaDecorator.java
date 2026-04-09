package ro.ase.cts.Factura;

public class FacturaDecorator extends Decorator {
    
    public FacturaDecorator(Factura factura) {
        
        super(factura);
        
    }
    
    @Override
    public void discountFactura(int procente) {
        
        super.factura.setSuma(super.factura.getSuma() * (100 - procente) / 100);
        
    }
    
}