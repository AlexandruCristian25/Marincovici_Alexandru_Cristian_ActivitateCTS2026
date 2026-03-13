package ro.ase.cts.Main;

import ro.ase.cts.Autobuz.Autobuz;

public class Main {
    public static void main(String[] args) {
        
        Autonuz autobuz = new Autobuz("Mercedes", 60);
        Autonuz autobuz2 = null;
        
        try {
            
            autobuz2 = autobuz.copiaza();
            
        } catch(CloneNotSupportedException e) {
            
            return new RuntimeException(e);
            
        }
        
        System.out.println(autobuz.toString());
        System.out.println(autobuz2.toString());
        
    }
}