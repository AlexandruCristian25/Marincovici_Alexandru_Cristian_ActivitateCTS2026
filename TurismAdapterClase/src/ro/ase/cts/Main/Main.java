package ro.ase.cts.Main;

import ro.ase.cts.Turism.PachetTuristic;
import ro.ase.cts.Turism.PachetCazare;
import ro.ase.cts.Turism.Autocar;
import ro.ase.cts.Turism.PachetAutocarInchiriat;

public class Main {

    public static void afiseazaRezervare(PachetTuristic pachetTuristic) {

        System.out.println("Pentru turist: ");
        pachetTuristic.descriere();

        System.out.println("Pentru agentie: ");
        pachetTuristic.rezervarePachet();
        
    }

    public static void main(String[] args) {

        PachetTuristic pachetCazare = new PachetCazare();
        afiseazaRezervare(pachetCazare);

        System.out.println();
        System.out.println("Utilizare autocar");

        Autocar autocar = new Autocar("Mercedes", 52);
        PachetTuristic pachetAutocar = new PachetAutocarInchiriat(autocar);

        afiseazaRezervare(pachetAutocar);
        
    }
    
}