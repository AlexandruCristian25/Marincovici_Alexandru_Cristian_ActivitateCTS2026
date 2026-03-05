package ro.ase.cts.Main;

import ro.ase.cts.BonCasa.BonCasa;
import ro.ase.cts.BonCasa.Farmacie;

public class Main {
    public static void main(String[] args) {

        Farmacie farmacie = new Farmacie("Catena");

        BonCasa bon1 = farmacie.emiteBon();
        bon1.adaugaProdus("Nurofen", 30);

        BonCasa bon2 = farmacie.emiteBon();
        bon2.adaugaProdus("Coldrex", 25);

        System.out.println(bon1);
        System.out.println(bon2);
    }
}
