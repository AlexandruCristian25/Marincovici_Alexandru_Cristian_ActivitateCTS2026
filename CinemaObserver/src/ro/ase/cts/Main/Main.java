package ro.ase.cts.Main;

import ro.ase.cts.Cinema.Cinema;
import ro.ase.cts.Cinema.Persoana;

public class Main {
    public static void main(String[] args) {

        Persoana persoanaIonescu = new Persoana("Ionescu");
        Persoana persoanaPopescu = new Persoana("Popescu");
        Persoana persoanaMarinescu = new Persoana("Marinescu");

        Cinema cinema = new Cinema("Cinema1");

        cinema.adaugaObserver(persoanaMarinescu);
        cinema.adaugaObserver(persoanaPopescu);
        cinema.adaugaObserver(persoanaIonescu);

        cinema.trimiteMesaj("A inceput premiera filmului!");
    }
}
