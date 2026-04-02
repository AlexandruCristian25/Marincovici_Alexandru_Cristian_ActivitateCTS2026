package ro.ase.cts.Main;

import ro.ase.cts.Cabana.Cabana;
import ro.ase.cts.Cabana.PachetCazare;
import ro.ase.cts.Cabana.RezervaCabana;
import ro.ase.cts.Cabana.AchitarePachet;

public class Main {
    public static void main(String[] args) {
        
        Cabana cabana = new Cabana("Brasov");
        cabana.rezervareCabana();
        
        Cabana cabana2 = new Cabana("Sinaia");
        cabana2.pachetCazare();
        
    }
}