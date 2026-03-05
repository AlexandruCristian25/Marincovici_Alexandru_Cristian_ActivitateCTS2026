package ro.ase.cts.Main;

import ro.ase.cts.Aeroport.Rezervare;
import ro.ase.cts.Aeroport.Prototype;

public class Main {
    public static void main(String[] args) {

        Rezervare rezervare1 = new Rezervare("Ion Popescu", "Paris", 12);
        System.out.println(rezervare1);

        Prototype rezervare2 = rezervare1.clone();
        System.out.println(rezervare2);
    }
}
