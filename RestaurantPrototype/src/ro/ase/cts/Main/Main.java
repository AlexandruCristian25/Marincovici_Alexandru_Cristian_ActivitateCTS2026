package ro.ase.cts.Main;

import ro.ase.cts.Restaurant.RezervareRestaurant;

public class Main {
    public static void main(String[] args) {
        
        RezervareRestaurant rezervare = new RezervareRestaurant("Restaurant1", 3, 17);
        RezervareRestaurant rezervare2 = null;
        
        try {
            
            rezervare2 = rezervare.copiaza();
            
        } catch(CloneNotSupportedException e) {
            
        }
        
        rezervare2.setNrMasa(7);
        
        System.out.println(rezervare.toString());
        System.out.println(rezervare2.toString());
        
    }
}