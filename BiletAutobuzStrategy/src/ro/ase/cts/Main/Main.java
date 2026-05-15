package ro.ase.cts.Main;

import ro.ase.cts.Bilet.Client;
import ro.ase.cts.Bilet.PlataCard;
import ro.ase.cts.Bilet.PlataSMS;

public class Main {

    public static void main(String[] args) {

        Client client = new Client("Popescu");

        client.setTipPlata(new PlataCard());
        client.plata(7);

        client.setTipPlata(new PlataSMS());
        client.plata(5);

    }

}
