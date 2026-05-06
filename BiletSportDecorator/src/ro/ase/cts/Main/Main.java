package ro.ase.cts.Main;

import ro.ase.cts.Bilet.Bilet;
import ro.ase.cts.Bilet.Decorator;
import ro.ase.cts.Bilet.BiletDecorator;

public class Main {
    public static void main(String[] args) {
        
        Bilet bilet = new Bilet(45, 780.90);
        bilet.cumparaBilet();
        
        System.out.println("---- Cu Decorator ----");
        
        IBilet biletDecorator = new BiletDecorator(bilet);
        biletDecorator.cumparaBilet();
        
    }
    
}