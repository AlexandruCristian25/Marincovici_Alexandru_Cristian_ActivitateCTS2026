package com.example;

import ro.ase.cts.Vapor.LocFactory;
import ro.ase.cts.Vapor.ILoc;
import ro.ase.cts.Vapor.RezervareLoc;

public class Main {
    public static void main(String[] args) {
        
        LocFactory factory = new LocFactory();
        
        ILoc loc1 = factory.getLoc(1);
        loc1.afisare(new RezervareLoc("Ion", 100));
        
        ILoc loc2 = factory.getLoc(1);
        loc2.afisare(new RezervareLoc("Maria", 120));
        
    }
    
}