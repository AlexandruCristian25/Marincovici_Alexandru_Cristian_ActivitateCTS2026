package ro.ase.cts.Main;

import ro.ase.cts.Fabrica.Categorie;
import ro.ase.cts.Fabrica.Item;
import ro.ase.cts.Fabrica.Optiune;

public class Main {
    public static void main(String[] args) {

        Optiune categorie = new Categorie("Productie");

        Optiune iOpen = new Item("In productie");
        Optiune iSave = new Item("Comanda salvata");
        Optiune iVizualizare = new Item("Vizualizare productie");
        Optiune iEdit = new Item("Comanda editata");

        try {

            categorie.adaugaNod(iVizualizare);
            categorie.adaugaNod(iEdit);

            categorie.adaugaNod(iOpen);
            categorie.adaugaNod(iSave);

            categorie.stergeNod(iSave);

            categorie.detalii();

        } catch (Exception e) {
           
            e.printStackTrace();
           
        }
       
    }
   
}