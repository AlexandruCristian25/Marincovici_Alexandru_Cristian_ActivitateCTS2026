package ro.ase.cts.Main;

import ro.ase.cts.Librarie.Client;
import ro.ase.cts.Librarie.Cash;
import ro.ase.cts.Librarie.Card;

public class Main {
    public static void main(String[] args) {

        Client client = new Client("Maria");
        Client client2 = new Client("Diana");

        client.setTipPlata(new Cash());
        client.plateste(45.99);

        client2.setTipPlata(new Card());
        client2.plateste(32.99);

    }
    
}