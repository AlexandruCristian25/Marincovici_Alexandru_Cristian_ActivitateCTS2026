package ro.ase.cts.Main;

import ro.ase.cts.RezervareBarca.RezervareBarca;

public class Main {
    public static void main(String[] args) {
        
        RezervareBarca rezervare = new RezervareBarca("Yamaha", 10, "Ionescu");
        RezervareBarca rezervare2 = null;
        
        try {
            
            rezervare2 = return.copiaza();
            
        } catch(CloneNotSupportedException e) {
            
            return new RuntimeException(e);
            
        }
        
        rezervare2.setNumePersoana("Popescu");
        
        System.out.println(rezervare.toString());
        System.out.println(rezervare2.toString());
        
    }
}