package ro.ase.cts.Main;

import ro.ase.cts.Cafenea.Client;
import ro.ase.cts.Cafenea.ICafenea;
import ro.ase.cts.Cafenea.Masa;

public class Main {

    private static void rezervaMasa(ICafenea cafenea) {
        System.out.println("Pentru client:");
        cafenea.detalii();
    }

    public static void main(String[] args) {

        Client client1 = new Client("Ionescu", 30);
        rezervaMasa(client1);

        Masa masa = new Masa(client1);
        masa.rezervareMasa();
        System.out.println(masa.toString());

        System.out.println("");

        System.out.println("Alt client:");
        Client client2 = new Client("Popescu", 47);
        rezervaMasa(client2);
    }
}
