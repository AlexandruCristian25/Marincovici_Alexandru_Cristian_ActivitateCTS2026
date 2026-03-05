package ro.ase.cts.Main;

import ro.ase.cts.Drona.Drona; 

public class Main {
    public static void main(String[] args) {
        
        Drona drona1 = Drona.getInstance("Drona1", 3500.90f, 3600);
        drona1.connect();
        System.out.println(drona1);
        
        Drona drona2 = Drona.getInstance("Drona2", 4600.90f, 4200);
        drona2.connect();
        System.out.println(drona2);
        
        if(drona1 == drona2) {
            
            System.out.println("Instantele sunt corelate");
            
        }
        
    }
    
}
