package ro.ase.cts.Main;

import ro.ase.cts.Produs.RezervareProdus;

public class Main {
    public static void main(String[] args) {
        
        RezervareProdus rezervare = new RezervareProdus("Sampon", 20, "Ingrijire personala");
        RezervareProdus rezervare2 = null;
        
        try {
            
            rezervare2 = rezervare.copiaza();
            
        } catch(CloneNotSupportedException e) {
            
        }

        rezervare2.setTipProdus("Electronice");

        System.out.println(rezervare.toString());
        System.out.println(rezervare2.toString());

    }
    
}