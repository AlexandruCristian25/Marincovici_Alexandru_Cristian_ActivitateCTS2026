package ro.ase.cts.Main;

import ro.ase.cts.Rezervare.Rezervare;

public class Main {
    public static void main(String[] args) {
        
        Rezervare rezervare = new Rezervare("Echipament muzica", 670.99, "13:00");
        Rezervare rezervare2 = null;
        
        try {
            
            rezervare2 = rezervare.copiaza();
            
        } catch(CloneNotSupportedException e) {
            
            return new RuntimeException(e);
            
        }
        
        rezervare2.setOra("15:00");
        
        System.out.println(rezervare.toString());
        System.out.println(rezervare2.toString());
        
    }
}