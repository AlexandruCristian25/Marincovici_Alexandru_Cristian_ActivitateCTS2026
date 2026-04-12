package ro.ase.cts.Main;

import ro.ase.cts.Sejur.ISejur;
import ro.ase.cts.Sejur.Rezervare;
import ro.ase.cts.Sejur.SejurFactory;

public class Main {
    public static void main(String[] args) {
        
        Rezervare rezervareMihaela = new Rezervare("Mihaela", "Tokyo", "Oferta1");
        Rezervare rezervareValentina = new Rezervare("Valentina", "Paris", "Oferta2");
        Rezervare rezervareIonut = new Rezervare("Ionut", "Cluj", "Oferta3");
        
        SejurFactory factory = new SejurFactory();
        
        ISejur sejur2 = factory.getSejur("Operator2");
        sejur2.printare(rezervareIonut);
        
        factory.getSejur("Operator3").printare(rezervareValentina);
        factory.getSejur("Operator4").printare(rezervareMihaela);
        
    }
}