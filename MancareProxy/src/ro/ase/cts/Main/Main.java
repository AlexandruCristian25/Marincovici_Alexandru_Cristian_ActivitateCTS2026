package ro.ase.cts.Main;

import ro.ase.cts.Mancare.FelMancare;
import ro.ase.cts.Mancare.IMancare;
import ro.ase.cts.Mancare.Mancare;
import ro.ase.cts.Mancare.MancareProxy;

public class Main {
    public static void main(String[] args) {
        
        Mancare mancare = new Mancare("Tocanita de cartofi", 17.99);
        
        IMancare fel = new FelMancare(mancare);
        fel.gatesteMancare();
        
        IMancare proxy = new MancareProxy(fel);
        proxy.gatesteMancare();
        
    }
    
}