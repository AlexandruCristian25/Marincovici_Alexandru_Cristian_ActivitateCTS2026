package ro.ase.cts.Main;

import ro.ase.cts.Laptop.*;

public class Main {

    public static void main(String[] args) {

        Laptop l1 = LaptopFactory.creareLaptop(TipLaptop.GAMING, "Asus", 32);
        Laptop l2 = LaptopFactory.creareLaptop(TipLaptop.OFFICE, "Dell", 16);
        Laptop l3 = LaptopFactory.creareLaptop(TipLaptop.HOME, "HP", 8);

        l1.afiseazaDetalii();
        l2.afiseazaDetalii();
        l3.afiseazaDetalii();
        
    }
    
}
