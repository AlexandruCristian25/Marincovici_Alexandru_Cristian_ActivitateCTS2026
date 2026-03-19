package ro.ase.cts.Main;

import ro.ase.cts.Ciocolata.Ciocolata;

public class Main {
    public static void main(String[] args) {
        
        CiocolataFactory ciocolataFactory = new CiocolataFactory();
        
        Ciocolata c1 = ciocolataFactory.afiseazaCiocolata(TipCiocolata.Amaruie, "LINDT", 15.99);
        Ciocolata c2 = ciocolataFactory.afiseazaCiocolata(TipCiocolata.Neagra, "Heidy", 20.99);
        Ciocolata c3 = ciocolataFactory.afiseazaCiocolata(TipCiocolata.Alba, "Milka", 9.99);
        
        c1.afiseazaInfo();
        c2.afiseazaInfo();
        c3.afiseazaInfo();
        
    }
}