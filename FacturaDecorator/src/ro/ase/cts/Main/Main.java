package ro.ase.cts.Main;

import ro.ase.cts.Factura.Factura;
import ro.ase.cts.Factura.Decorator;
import ro.ase.cts.Factura.FacturaDecorator;

public class Main {
    public static void main(String[] args) {
        
        Factura factura = new Factura(23, 5600.40);
        
        factura.afiseazaDetalii();
        
        Decorator facturaDecorator = new FacturaDecorator(factura);
        
        facturaDecorator.discountFactura(15);
        facturaDecorator.afiseazaDetalii();
        
    }
}