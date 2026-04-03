package com.example;

import ro.ase.cts.Nava.NavaFactory;
import ro.ase.cts.Nava.INava;
import ro.ase.cts.Nava.Rezervare;

public class Main {
    public static void main(String[] args) {
        
        Rezervare rezervareCristina = new Rezervare("Cristina", 450.90);
        Rezervare rezervareMihaela = new Rezervare("Mihaela", 780.90);
        Rezervare rezervareValentina = new Rezervare("Valentina", 520.90);
        
        NavaFactory factory = new NavaFactory();
        
        INava nava2 = factory.getNava("Camera simpla");
        nava2.detalii(rezervareValentina);
        factory.getNava("Camera dubla").detalii(rezervareCristina);
        factory.getNava("Camera twin").detalii(rezervareMihaela);
        
    }
    
}