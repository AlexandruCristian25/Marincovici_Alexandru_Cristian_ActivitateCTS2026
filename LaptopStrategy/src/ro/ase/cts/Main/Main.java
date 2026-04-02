package ro.ase.cts.Main;

import ro.ase.cts.Laptop.LaptopGaming;
import ro.ase.cts.Laptop.LaptopOffice;
import ro.ase.cts.Laptop.Programator;

public class Main {
    public static void main(String[] args) {
        
        Programator programator = new Programator("Mihai");
        
        programator.setTipLaptop(new LaptopGaming());
        programator.utilizeaza(16);
        
        programator.setTipLaptop(new LaptopOffice());
        programator.utilizeaza(8);
        
    }
    
}