package ro.ase.cts.Main;

import ro.ase.cts.Produs.Produs;
import ro.ase.cts.Produs.Decorator;
import ro.ase.cts.Produs.ProdusDecorat;


public class Main {
    public static void main(String[] args) {
        
        Produs produs = new Produs("Paine", 1.60);
        produs.afiseazaInfo();
        Decorator produsDecorat = new ProdusDecorat(produs);
        produsDecorat.aplicaDiscount(3);
        produsDecorat.afiseazaInfo();
        
    }
}