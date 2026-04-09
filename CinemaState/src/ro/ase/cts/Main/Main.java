package ro.ase.cts.Main;

import ro.ase.cts.Cinema.Loc;

public class Main {
    public static void main(String[] args) {
        
        Loc loc = new Loc(45);
        loc.elibereazaLoc();
        loc.rezervaLoc();
        loc.ocupaLoc();
        loc.ocupaLoc();
        loc.rezervaLoc();
        loc.elibereazaLoc();
        
    }
    
}