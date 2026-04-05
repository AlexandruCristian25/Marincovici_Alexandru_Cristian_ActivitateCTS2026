package undo.program;

import ro.ase.cts.Sejur.Client;
import ro.ase.cts.Sejur.Sejur;

public class Program {

    public static void main(String[] args) {

        Sejur sejur = new Sejur("Grecia");

        Client client1 = new Client("Ana");
        Client client2 = new Client("Ion");

        sejur.adaugaNotificare(client1);
        sejur.adaugaNotificare(client2);

        sejur.notificareOfertaNoua();
        sejur.notificareReducerePret();

        sejur.stergeNotificare(client1);

        sejur.notificareReducerePret();
        
    }
    
}