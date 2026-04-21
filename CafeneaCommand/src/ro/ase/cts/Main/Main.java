package ro.ase.cts.Main;

import ro.ase.cts.Cafenea.Client;
import ro.ase.cts.Cafenea.ComandaClient;
import ro.ase.cts.Cafenea.Command;

public class Main {
    public static void main(String[] args) {
        
        Client client = new Client("Ionescu");
        Command comanda = new ComandaClient(client);
        client.invoca(comanda);
        
    }
    
}