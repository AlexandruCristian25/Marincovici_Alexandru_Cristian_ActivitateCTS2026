package ro.ase.cts.Main;

import ro.ase.cts.Bon.Bon;
import ro.ase.cts.Bon.Decorator;
import ro.ase.cts.Bon.BonDecorat;

public class Main {
    public static void main(String[] args) {
        
        Bon bon = new Bon(2542, 560.90);
        bon.printeazaBon();
        
        Decorator bonDecorat = new BonDecorat(bon);
        
        bonDecorat.discount(20);
        bonDecorat.printeazaBon();
        
    }
    
}