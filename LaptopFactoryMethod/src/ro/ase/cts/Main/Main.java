package ro.ase.cts.Main;

import ro.ase.cts.Laptop.*;

public class Main {

    public static void main(String[] args) {

        LaptopFactory laptopFactory = new LaptopFactory();

        Laptop l1 = laptopFactory.creareLaptop(TipLaptop.GAMING, "Asus", 32);
        Laptop l2 = laptopFactory.creareLaptop(TipLaptop.OFFICE, "Dell", 16);
        Laptop l3 = laptopFactory.creareLaptop(TipLaptop.HOME, "HP", 8);

        l1.afiseazaDetalii();
        l2.afiseazaDetalii();
        l3.afiseazaDetalii();
        
    }
    
}
