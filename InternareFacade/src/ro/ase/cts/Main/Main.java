package ro.ase.cts.Main;

import ro.ase.cts.Internare.Facade;

public class Main {
    public static void main(String[] args) {
        
        int nrSalon = 4;
        
        System.out.println(Facade.verificareDisponibilitateSalon(nrSalon));
        
    }
    
}