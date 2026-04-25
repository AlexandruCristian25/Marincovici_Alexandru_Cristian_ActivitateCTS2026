package ro.ase.cts.Main;

import ro.ase.cts.Bilet.Bilet;
import ro.ase.cts.Bilet.BiletElectronic;
import ro.ase.cts.Bilet.BiletFizic;

public class Main {
    public static void main(String[] args) {
        Bilet bilet = new Bilet("Popescu");

        bilet.setIBilet(new BiletFizic());
        bilet.rezervare(78);

        bilet.setIBilet(new BiletElectronic());
        bilet.rezervare(25);
    }
}
