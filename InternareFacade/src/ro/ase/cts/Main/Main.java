package ro.ase.cts.Main;

import ro.ase.cts.Pacient;
import ro.ase.cts.Medic;
import ro.ase.cts.Salon;
import ro.ase.cts.Facade;

public class Main {
    public static void main(String[] args) {
        
        String nume = "Ionescu";
        int nrSalon = 4;
        
        System.out.println(Facade.verificareDisponibilitateSalon(nrSalon));
        
    }
}