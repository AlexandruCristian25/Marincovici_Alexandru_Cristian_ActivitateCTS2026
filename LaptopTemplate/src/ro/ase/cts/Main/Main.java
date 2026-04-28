package ro.ase.cts.Main;

import ro.ase.cts.Laptop.Laptop;
import ro.ase.cts.Laptop.Utilizator;

public class Main {
    public static void main(String[] args) {

        Laptop utilizator = new Utilizator("ACER");
        utilizator.cumparaLaptop("ACER");

        Laptop utilizator2 = new Utilizator("ASUS");
        utilizator2.cumparaLaptop("ASUS");
        
    }
    
}