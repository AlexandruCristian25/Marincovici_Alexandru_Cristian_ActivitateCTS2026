package ro.ase.cts.Main;

import ro.ase.cts.RezervareLoc.RezervareLoc;

public class Main {
    public static void main(String[] args) {
        
        RezervareLoc rezervare = new RezervareLoc.Builder.setNrLoc("Nr loc: 78").build();
        
        System.out.println(rezervare.toString());
        
    }
}