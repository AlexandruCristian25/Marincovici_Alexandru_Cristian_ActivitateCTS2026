package ro.ase.cts.Main;

import ro.ase.cts.Internare.Pacient;
import ro.ase.cts.Internare.Salon;
import ro.ase.cts.Internare.Proxy;

public class Main {
    public static void main(String[] args) {
        
        Pacient pacient = new Pacient("Iuliana", "0711223344");
        Salon salon = new Salon(pacient);
        salon.rezervare();
        
        Proxy proxy = new Proxy(pacient);
        proxy.rezervare();
        
    }
    
}