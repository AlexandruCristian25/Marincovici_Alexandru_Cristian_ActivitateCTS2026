package ro.ase.cts.Main;

import ro.ase.cts.Zoo.Persoana;
import ro.ase.cts.Zoo.BiletFizic;
import ro.ase.cts.Zoo.BiletElectronic;

public class Main {
    public static void main(String[] args) {
        
        Persoana persoana = new Persoana("Ionescu");
        Persoana persoana2 = new Persoana("Popescu");
        
        persoana.setTipBilet(new BiletFizic());
        persoana.rezervare("Miercuri");
        
        persoana2.setTipBilet(new BiletElectronic());
        persoana2.rezervare("Sambata");
        
    }
    
}