package ro.ase.cts.Main;

import ro.ase.cts.Cafenea.Cafea;
import ro.ase.cts.Cafenea.Decorator;
import ro.ase.cts.Cafenea.CafeaDecorata0;

public class Main {
    public static void main(String[] args) {
        
        Cafea cafea = new Cafea("Capuchino", 7.99);
        cafea.vindeCafea();
        
        Decorator cafeaDecorata = new CafeaDecorata(cafea);
        cafeaDecorata.vindeCafea();
        
    }
    
}