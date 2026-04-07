package ro.ase.cts.Main;

import ro.ase.cts.Banca.Client;
import ro.ase.cts.Banca.Card;
import ro.ase.cts.Banca.Cash;

public class Main {
    public static void main(String[] args) {
        
        Client client = new Client("Ionescu");
        
        client.setMetodaPlata(new Card());
        client.plateste(750);
        
        client.setMetodaPlata(new Cash());
        client.plateste(400);
        
    }
    
}