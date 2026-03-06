package ro.ase.cts.Main;

import ro.ase.cts.Joc.RezervareJoc;

public class Main {

    public static void main(String[] args) {

        RezervareJoc rezervare1 = new RezervareJoc()
                .adaugaScut()
                .adaugaArma()
                .build();

        System.out.println(rezervare1);

        RezervareJoc rezervare2 = new RezervareJoc()
                .adaugaMagie()
                .build();

        System.out.println(rezervare2);
    }
}