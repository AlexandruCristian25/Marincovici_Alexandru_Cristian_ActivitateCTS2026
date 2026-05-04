package ro.ase.cts.Main;

import ro.ase.cts.Cafenea.Cafenea;
import ro.ase.cts.Cafenea.Persoana;

public class Main {
    public static void main(String[] args) {

        Persoana persoana1 = new Persoana("Mihaela");
        Persoana persoana2 = new Persoana("Valentina");
        Persoana persoana3 = new Persoana("Georgiana");

        Cafenea cafenea = new Cafenea("Cafenea1");

        cafenea.adaugaObserver(persoana3);
        cafenea.adaugaObserver(persoana2);
        cafenea.notificareNoua();

        cafenea.adaugaObserver(persoana1);
        
    }
    
}