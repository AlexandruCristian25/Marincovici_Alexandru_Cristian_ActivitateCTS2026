package ro.ase.cts.Main;

import ro.ase.cts.Electronice.Utilizator;
import ro.ase.cts.Electronice.Laptop;
import ro.ase.cts.Electronice.Telefon;

public class Main {
    public static void main(String[] args) {
        
        Utilizator utilizator = new Utilizator("Georgiana");
        
        utilizator.setTipElectronice(new Laptop());
        utilizator.utilizare(16);
        
        utilizator.setTipElectronice(new Telefon());
        utilizator.utilizare(12);
        
    }
    
}