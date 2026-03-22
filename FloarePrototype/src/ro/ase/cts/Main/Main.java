package ro.ase.cts.Main;

import ro.ase.cts.Floare.RezervareFloare;

public class Main {
    public static void main(String[] args) {
        
        RezervareFloare rezervare = new RezervareFloare("Lalea", "Marti");
        RezervareFloare rezervare2 = null;

        try {

            rezervare2 = rezervare.copiaza();

        } catch(CloneNotSupportedException e) {

        }

        rezervare2.setZi("Vineri");
        
        System.out.println(rezervare.toString());
        System.out.println(rezervare2.toString());
        
    }
}