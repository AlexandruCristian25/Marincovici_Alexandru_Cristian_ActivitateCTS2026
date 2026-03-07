package com.example;

public class Main {
    
    public static void main(String[] args) {
        
        Laptop l1 = LaptopFactory.afiseazaLaptop(tipLaptop.LaptopGaming, "ASUS", 4599.99f);
        Laptop l2 = LaptopFactory.afiseazaLaptop(tipLaptop.LaptopOffice, "ACER", 2500.99f);
        Laptop l3 = LaptopFactory.afiseazaLaptop(tipLaptop.LaptopHome, "Lenovo", 1799.99f);
        
        l1.afiseazaInfo();
        l2.afiseazaInfo();
        l3.afiseazaInfo();
        
    }
    
}