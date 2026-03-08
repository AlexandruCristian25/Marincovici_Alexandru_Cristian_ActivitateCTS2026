package ro.ase.cts.Main;

import ro.ase.cts.BiletConcert.BiletConcert;

public class Main {
    public static void main(String[] args) {
        
        BiletConcert bilet = new BiletConcert("Popescu", 45.99, 39);
        BiletConcert bilet2 = null;
        
        try {
            
            bilet2 = bilet.copiaza();
            
        } catch(CloneNotSupportedException e) {
            
            return new RuntimeException(e);
            
        }
        
        bilet2.setNrLoc(56);
        
        System.out.println(bilet.toString());
        System.out.println(bilet2.toString());
        
    }
}