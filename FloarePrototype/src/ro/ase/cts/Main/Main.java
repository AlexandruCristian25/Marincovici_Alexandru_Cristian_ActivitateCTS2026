package ro.ase.cts.Main;

import ro.ase.cts.RezervareFloare.RezervareFloare;

public class Main {
    public static void main(String[] args) {
        
        RezervareFloare rezervare = new RezervareFloare("Lalea", "Marti");
        RezervareFloare rezervare2 = null;
        
        try {
            
            rezervare2 = rezervare.copiaza();
            
        } catch(CloneNotSupportedException e) {
            
            return new RuntimeException(e);
            
        }
        
        rezervare2.setZi("Vineri");
        
        System.out.println(rezervare.toString());
        System.out.println(rezervare2.toString());
        
    }
}