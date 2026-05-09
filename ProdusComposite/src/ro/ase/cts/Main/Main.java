package ro.ase.cts.Produs;

public class Main {

    public static void main(String[] args) {

        Optiune categorie = new Categorie("Produse Alimentare");

        Optiune iOpen = new Item("Alegere produs");
        Optiune iSave = new Item("Produs salvat");
        Optiune iVizualizare = new Item("Vizualizare produs");
        Optiune iEdit = new Item("Comanda editata");

        try {

            categorie.adaugaNod(iVizualizare);
            categorie.adaugaNod(iEdit);
            categorie.adaugaNod(iOpen);
            categorie.adaugaNod(iSave);

            categorie.stergeNod(iSave);

            categorie.info();

        } catch (Exception e) {
           
            e.printStackTrace();
           
        }
       
    }
   
}