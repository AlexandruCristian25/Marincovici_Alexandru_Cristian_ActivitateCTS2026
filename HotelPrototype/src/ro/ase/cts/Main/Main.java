package ro.ase.cts.Main;

import ro.ase.cts.Hotel.Rezervare;

public class Main {
    public static void main(String[] args) {
        
        Rezervare rezervare = new Rezervare("Popescu", "popescu@yahoo.com", 3);
        Rezervare rezervare2 = null;
        
        try {
            
            rezervare2 = rezervare.copiaza();
            
        } catch(CloneNotSupportedException e) {
            
            throw new RuntimeException(e);
            
        }
        
        rezervare2.setNrPersoane(5);
        
        System.out.println(rezervare.toString());
        System.out.println(rezervare2.toString());
        
    }
}