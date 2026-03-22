package ro.ase.cts.Main;

import ro.ase.cts.Carte.Carte;
import ro.ase.cts.Carte.CarteFactory;
import ro.ase.cts.Carte.TipCarte;

public class Main {
    public static void main(String[] args) {
        
        CarteFactory carteFactory = new CarteFactory();
        
        Carte c1 = carteFactory.creeazaCarte(TipCarte.CarteStiinta, "Autor1 ", 230);
        Carte c2 = carteFactory.creeazaCarte(TipCarte.CarteFizica, "Autor2 ", 160);
        Carte c3 = carteFactory.creeazaCarte(TipCarte.CarteMatematica, "Autor3 ", 200);
        
        c1.afiseazaInfo();
        c2.afiseazaInfo();
        c3.afiseazaInfo();
        
    }
}
