package ro.ase.cts.Main;

import ro.ase.cts.Joc.JocAchizitionat;
import ro.ase.cts.Joc.Producator;
import ro.ase.cts.Joc.Facade;

public class Main {
    public static void main(String[] args) {
        
        int pret = 8;
        
        Systrm.out.println(Facade.verificareDisponibilitateCamera(pret));
        
    }
}