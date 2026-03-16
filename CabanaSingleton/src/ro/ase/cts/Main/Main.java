package ro.ase.cts.Main;

import ro.ase.cts.Cabana.Cabana;

public class Main {
    public static void main(String[] args) {
        
        Cabana c1 = new Cabana("Locatie1", 5);
        Cabana c2 = new Cabana("Locatie2", 6);
        
        c1.afisareDetaliiCabana();
        c2.afisareDetaliiCabana();
        
    }
}