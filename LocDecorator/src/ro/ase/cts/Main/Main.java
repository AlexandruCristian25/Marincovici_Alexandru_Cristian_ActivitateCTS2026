package ro.ase.cts.Main;

import ro.ase.cts.Loc.Loc;
import ro.ase.cts.Loc.Decorator;
import ro.ase.cts.Loc.LocDecorat;

public class Main {
    public static void main(String[] args) {
        
        Loc loc = new Loc(45, 5);
        loc.afiseazaInfo();
        
        Decorator locDecorat = new LocDecorat(loc);
        
        locDecorat.aplicaDiscount(7);
        locDecorat.afiseazaInfo();
        
    }
    
}