package ro.ase.cts.Main;

import ro.ase.cts.Avion.Avion;

public class Main {
    public static void main(String[] args) {
        
        Avion avion = new Avion();
        
        Avion pasageri = avion.getAvion(TipAvion.Pasageri, "Companie1", 15);
        Avion marfa = avion.getAvion(TipAvion.Marfa, "Companie2", 10);
        
        pasageri.afiseazaInfo();
        marfa.afiseazaInfo();
        
        
        
    }
}