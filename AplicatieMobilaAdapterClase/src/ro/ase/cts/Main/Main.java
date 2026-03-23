package ro.ase.cts.Main;

import ro.ase.cts.Aplicatie.IAplicatieMobila;
import ro.ase.cts.Aplicatie.Software;
import ro.ase.cts.Aplicatie.AplicatieMobila;
import ro.ase.cts.Aplicatie.Aplicatie;

public class Main {
    public static void main(String[] args) {
        
        IAplicatie iAplicatie = new IAplicatie();
        
        private static afiseazaAplicatie(IAplicatie iAplicatie) {
            
            System.out.println("Tip aplicatie: ");
            iAplicatie.descriere();
            System.out.println("Se creeaza software-ul");
            iAplicatie.creeazaSoftware();
            
        }
        
    }
}