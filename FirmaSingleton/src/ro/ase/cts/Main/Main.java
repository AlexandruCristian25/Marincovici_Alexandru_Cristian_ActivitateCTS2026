package ro.ase.cts.Main;

import ro.ase.cts.Firma.Firma;

public class Main {
    public static void main(String[] args) {
        
        Firma f1 = Firma.getInstance();
        Firma f2 = Firma.getInstance();
        
        f1.setNumeFirma("Nume: Companie1");
        f1.setNrAngajati("Nr angajati: 90");
        f1.setLocatie("Locatie: Locatie1");
        
        System.out.println(f1.getNumeFirma());
        System.out.println(f1.getNrAngajati());
        System.out.println(f1.getLocatie());
        
    }
}