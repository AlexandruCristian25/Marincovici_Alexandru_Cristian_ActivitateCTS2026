package ro.ase.cts.Main;

import ro.ase.cts.Casa.Casa;

public class Main {
    public static void main(String[] args) {
        
        Casa c1 = new Casa("Locatie1", 450.90f);
        Casa c2 = new Casa("Locatie2", 370.90f);
        
        c1.afiseazaDetaliiCasa();
        c2.afiseazaDetaliiCasa();
        
        
    }
}