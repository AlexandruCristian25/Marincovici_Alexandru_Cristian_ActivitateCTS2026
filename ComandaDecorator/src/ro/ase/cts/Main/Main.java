package ro.ase.cts.Main;

import ro.ase.cts.Comanda.Comanda;
import ro.ase.cts.Comanda.ComandaDecorator;
import ro.ase.cts.Comanda.Decorator;

public class Main {
    public static void main(String[] args) {
        
        Comanda comanda = new Comanda(482514, 6700.90);
        
        comanda.afiseazaComanda();
        
        Decorator comandaDecorator = new ComandaDecorator(comanda);
        
        comandaDecorator.discount(25);
        comandaDecorator.afiseazaComanda();
        
    }
}