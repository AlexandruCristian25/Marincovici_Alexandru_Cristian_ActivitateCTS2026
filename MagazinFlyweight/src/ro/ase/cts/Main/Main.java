package ro.ase.cts.Main;

import ro.ase.cts.Magazin.IMagazin;
import ro.ase.cts.Magazin.Produs;
import ro.ase.cts.Magazin.MagazinFactory;

public class Main {
    public static void main(String[] args) {
        
        Produs produsPaine = new Produs("Paine", 8);
        Produs produsCafea = new Produs("Cafea", 23);
        Produs produsSapun = new Produs("Sapun", 51);
        
        MagazinFactory factory = new MagazinFactory();
        
        IMagazin magazin2 = factory.getMagazin(6);
        magazin2.vanzare(produsSapun);
        factory.getMagazin(8).vanzare(produsPaine);
        factory.getMagazin(5).vanzare(produsCafea);
        
    }
    
}