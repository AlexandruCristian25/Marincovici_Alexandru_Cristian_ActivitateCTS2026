package ro.ase.cts.Main;

import ro.ase.cts.Carte.Carte;

public class Main {
    public static void main(String[] args) {
        
        Carte c1 = CaryeFactory.creeazaCarte(TipCarte.CarteStiinta, "Autor1", 230);
        Carte c2 = CaryeFactory.creeazaCarte(TipCarte.CarteFizica, "Autor2", 160);
        Carte c3 = CaryeFactory.creeazaCarte(TipCarte.CarteMatematica, "Autor3", 200);
        
        c1.afiseazaInfo();
        c2.afiseazaInfo();
        c3.afiseazaInfo();
        
    }
}