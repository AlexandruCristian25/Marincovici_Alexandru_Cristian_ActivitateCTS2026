package ro.ase.cts.Main;

import ro.ase.cts.Agentie.PachetCazare;
import ro.ase.cts.Agentie.PachetAutocarInchiriat;
import ro.ase.cts.Agentie.IPachet;
import ro.ase.cts.Agentie.Autocar;

public class Main {
    
    private static void printareRezervare(IPachet pachet) {
        System.out.println("Pentru client: ");
        pachet.info();
        System.out.println("Pentru operator: ");
        pachet.rezervarePachet();
    }
    
    public static void main(String[] args) {
        
        IPachet pachetCazare = new PachetCazare();
        printareRezervare(pachetCazare);
        
        System.out.println("--------------------------");
        
        System.out.println("Inchiriere autocar: ");
        Autocar autocar = new Autocar("Mercedes", 60);
        
        System.out.println("--------------------------");
        
        System.out.println("Utilizare adapter: ");
        Autocar autocar2 = new Autocar("Renault", 50);
        IPachet pachetAutocar = new PachetAutocarInchiriat(autocar2);
        
        printareRezervare(pachetAutocar);
        
    }
    
}