package ro.ase.cts.Main;

import ro.ase.cts.Taxi.Taxi;

public class Main {
    public static void main(String[] args) {
        
        Taxi taxi = new Taxi(17);
        taxi.eliberareTaxi();
        taxi.schimbaOra();
        taxi.rezervareTaxi();
        taxi.rezervareTaxi();
        taxi.schimbaOra();
        taxi.eliberareTaxi();
        
    }
    
}