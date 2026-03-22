package ro.ase.cts.Main;

import ro.ase.cts.Concert.RezervareLoc;

public class Main {
    public static void main(String[] args) {
        
        RezervareLoc rezervare = new RezervareLoc.RezervareLoc1().Builder().setNrLoc(Integer.parseInt("Nr loc: 78")).build();
        
        System.out.println(rezervare.toString());
        
    }
}