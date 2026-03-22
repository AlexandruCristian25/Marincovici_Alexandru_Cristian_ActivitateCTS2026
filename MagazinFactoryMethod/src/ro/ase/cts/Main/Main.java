package ro.ase.cts.Main;

import ro.ase.cts.Magazin.*;

public class Main {

    public static void main(String[] args) {

        MagazinFactory magazinFactory = new MagazinFactory();

        Magazin m1 = magazinFactory.creareMagazin(TipMagazin.ALIMENTAR, "Mega Image ", 300);
        Magazin m2 = magazinFactory.creareMagazin(TipMagazin.HAINE, "Zara ", 500);
        Magazin m3 = magazinFactory.creareMagazin(TipMagazin.ELECTRONICE, "Altex ", 700);

        m1.afiseazaDetalii();
        m2.afiseazaDetalii();
        m3.afiseazaDetalii();

    }
}
