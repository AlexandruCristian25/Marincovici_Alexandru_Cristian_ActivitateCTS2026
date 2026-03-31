package ro.ase.cts.Main;

import ro.ase.cts.Factura.Factura;
import ro.ase.cts.Factura.FacturaDecorator;
import ro.ase.cts.Factura.Decorator;

public class Main {
    public static void main(String[] args) {
        
        Bilet bilet = new Bilet(4, "Ionescu");
        
        bilet.afiseazaInfo();
        
        Decorator biletDecorator = new BiletDecorator(bilet);
        
        biletDecorator.aplicareDiscount(30);
        biletDecorator.afiseazaInfo();
        
    }
}