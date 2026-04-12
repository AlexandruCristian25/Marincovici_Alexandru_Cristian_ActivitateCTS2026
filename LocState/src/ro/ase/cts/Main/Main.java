package ro.ase.cts.Main;

import ro.ase.cts.Loc.Loc;

public class Main {
    public static void main(String[] args) {

        Loc loc = new Loc(23);

        loc.eliberareLoc();
        loc.rezervareLoc();
        loc.ocupaLoc();
        loc.ocupaLoc();
        loc.rezervareLoc();
        loc.eliberareLoc();
        
    }
    
}