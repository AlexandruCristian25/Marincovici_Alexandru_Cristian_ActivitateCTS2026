package ro.ase.cts.Main;

import ro.ase.cts.Carte.ICarte;
import ro.ase.cts.Carte.Cumpara;
import ro.ase.cts.Carte.CarteFactory;

public class Main {
    public static void main(String[] args) {

        Cumpara cumpara1 = new Cumpara("Assassin's Creed Cruciada Secreta", "Actiune");
        Cumpara cumpara2 = new Cumpara("Soarele Gol", "SF");
        Cumpara cumpara3 = new Cumpara("Printul Persiei Nisipul Timpului", "Aventura");

        CarteFactory factory = new CarteFactory();

        ICarte carte2 = factory.getCarte(24);
        carte2.info(cumpara3);

        factory.getCarte(21).info(cumpara2);
        factory.getCarte(17).info(cumpara1);
        
    }
    
}