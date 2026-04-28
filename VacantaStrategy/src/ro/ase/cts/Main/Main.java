package ro.ase.cts.Main;

import ro.ase.cts.Vacanta.Client;
import ro.ase.cts.Vacanta.PlataCash;
import ro.ase.cts.Vacanta.PlataCard;

public class Main {
    public static void main(String[] args) {

        Client client = new Client("Ionescu");

        client.setTipPlata(new PlataCash());
        client.plateste(2300.90);

        client.setTipPlata(new PlataCard());
        client.plateste(3700.90);

    }

}