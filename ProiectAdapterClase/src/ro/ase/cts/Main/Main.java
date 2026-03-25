package ro.ase.cts.Main;

import ro.ase.cts.Vacanta.Vacanta;
import ro.ase.cts.Vacanta.Destinatie;
import ro.ase.cts.Vacanta.Facade;

public class Main {
    public static void main(String[] args) {
        
        double pret = 6700.90;
        
        System.out.println(Facade.verificarePretPachet(pret));
        
    }
}