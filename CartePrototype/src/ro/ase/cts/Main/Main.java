package ro.ase.cts.Main;

import ro.ase.cts.Carte.RezervareCarte;

public class Main {

    public static void main(String[] args) {

        RezervareCarte rezervare1 = new RezervareCarte("Design Patterns",
                    "Erich Gamma", 395);

        RezervareCarte rezervare2 = (RezervareCarte) rezervare1.copiaza();

        System.out.println(rezervare1);
        System.out.println(rezervare2);
        
    }
    
}