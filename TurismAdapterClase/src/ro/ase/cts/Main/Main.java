package ro.ase.cts.Main;

import ro.ase.cts.Turism.PachetTurism;
import ro.ase.cts.Turism.PachetCazare;
import ro.ase.cts.Turism.Autocar;
import ro.ase.cts.Turism.PachetAutocar;
import ro.ase.cts.Turism.PachetAutocarInchitiat;

public class Main {
    public static void main(String[] args) {
        
        PachetTuristic pachetCazare = new PachetTuristic();
        
        afisareRezervare(pachetCazare);1
        
        private static void afiseazaRezervare(PachetTuristic pachetTuristic) {
            
            System.out.println("Pentru turist: ");
            pachetTuristic.descriere();
            
            System.out.println("Pentru agentie: ");
            pachetTuristic.rezervaPachet();
            
        }
        
        System.out.println();
        System.out.println("Utilizare autocar");
        Autocar autocar = new Autocar("Mercedes", 52);
        AutocarInchiriat autocarInchiriat = new AutocarInchiriat(autocar);
        
    }
}