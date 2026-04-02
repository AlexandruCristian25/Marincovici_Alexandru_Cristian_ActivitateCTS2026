package ro.ase.cts.Main;

import ro.ase.cts.Cabana.Cabana;
import ro.ase.cts.Cabana.PachetCazare;
import ro.ase.cts.Cabana.RezervaCabana;
import ro.ase.cts.Cabana.AchitarePachet;

public class Main {
    public static void main(String[] args) {
        
        Cabana cabana1 = new PachetCazare("Brasov");
        cabana1.vindePachet();
        
        Cabana cabana2 = new RezervaCabana("Sinaia");
        cabana2.vindePachet();
        
        Cabana cabana3 = new AchitarePachet("Predeal");
        cabana3.vindePachet();
        
    }
}
