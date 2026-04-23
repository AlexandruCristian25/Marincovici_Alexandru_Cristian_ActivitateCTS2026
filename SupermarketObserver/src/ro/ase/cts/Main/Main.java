package com.example;

import ro.ase.cts.Supermarket.Client;
import ro.ase.cts.Supermarket.Supermarket;

public class Main {
    public static void main(String[] args) {
        
        Client clientAlex = new Client("Alex");
        Client clientValentina = new Client("Valentina");
        Client clientGeorgiana = new Client("Georgiana");
        
        Supermarket supermarket = new Supermarket("LIDL");
        
        supermarket.adaugaObserver(clientGeorgiana);
        supermarket.adaugaObserver(clientValentina);
        
        supermarket.notificareOferta();
        supermarket.adaugaObserver(clientAlex);
        
    }
    
}