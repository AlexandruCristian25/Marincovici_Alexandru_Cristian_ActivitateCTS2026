package ro.ase.cts.Main;

import ro.ase.cts.Bilet.Bilet;
import ro.ase.cts.Bilet.IBilet;
import ro.ase.cts.Bilet.BiletDecorat;

public class Main {

    public static void main(String[] args) {

        IBilet bilet = new Bilet("Ion", 50);
        bilet.afisareBilet();

        System.out.println();

        IBilet biletDecorat = new BiletDecorat(bilet);
        biletDecorat.afisareBilet();
        
    }
    
}