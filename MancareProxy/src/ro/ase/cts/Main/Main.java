package ro.ase.cts.Main;

import ro.ase.cts.Mancare.IMancare;
import ro.ase.cts.Mancare.Mancare;
import ro.ase.cts.Mancare.MancareProxy;

public class Main {
    public static void main(String[] args) {
        
        Mancare mancare = new Mancare("Tocanita de cartofi", 17.99);
        IMancare iMancare = new IMancare(mancare);
        iMancare.gatesteMancare();
        
        MancareProxy iMancareProxy = new MancareProxy(mancare);
        iMancareProxy.gatesteMancare();
        
    }
