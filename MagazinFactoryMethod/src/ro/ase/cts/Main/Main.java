package ro.ase.cts.Main;

import ro.ase.cts.Magazin.*;

public class Main {

    public static void main(String[] args) {

        Magazin m1 = MagazinFactory.creareMagazin(TipMagazin.ALIMENTAR, "Mega Image", 300);
        Magazin m2 = MagazinFactory.creareMagazin(TipMagazin.HAINE, "Zara", 500);
        Magazin m3 = MagazinFactory.creareMagazin(TipMagazin.ELECTRONICE, "Altex", 700);

        m1.afiseazaDetalii();
        m2.afiseazaDetalii();
        m3.afiseazaDetalii();
    }
}
