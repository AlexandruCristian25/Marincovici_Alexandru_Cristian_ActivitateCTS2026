package ro.ase.cts.Main;

import ro.ase.cts.Masina.*;

public class Main {

    public static void main(String[] args) {

        Masina m1 = MasinaFactory.creareMasina(TipMasina.CURSE, "Ferrari", 700);
        Masina m2 = MasinaFactory.creareMasina(TipMasina.ORAS, "Dacia Logan", 90);
        Masina m3 = MasinaFactory.creareMasina(TipMasina.MARFA, "Mercedes Actros", 450);

        m1.afiseazaDetalii();
        m2.afiseazaDetalii();
        m3.afiseazaDetalii();
    }
}