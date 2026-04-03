package ro.ase.cts.Main;

import ro.ase.cts.Teatru.Spectator;
import ro.ase.cts.Teatru.RezervareProxy;

public class Main {
    public static void main(String[] args) {
        
        Spectator spectator = new Spectator("Bianca", 89);
        System.out.println(spectator.toString());
        
        RezervareProxy rezervareProxy = new RezervareProxy(spectator);
        rezervareProxy.rezervaLoc();
        
    }
    
}