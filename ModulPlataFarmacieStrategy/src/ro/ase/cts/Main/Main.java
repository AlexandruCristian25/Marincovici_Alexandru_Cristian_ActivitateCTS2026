package ro.ase.cts.Main;

import ro.ase.cts.Plata.Client;
import ro.ase.cts.Plata.Cash;
import ro.ase.cts.Plata.Card;

public class Main {
    public static void main(String[] args) {
        
        Client client = new Client("Miruna");
        
        client.setModulPlata(new Cash());
        client.plateste(79.90);
        
        client.setModulPlata(new Card());
        client.plateste(45.90);
        
    }
    
}