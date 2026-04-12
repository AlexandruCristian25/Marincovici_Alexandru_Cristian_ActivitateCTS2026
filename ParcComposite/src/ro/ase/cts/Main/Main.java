package ro.ase.cts.Main;

import ro.ase.cts.Parc.IParc;
import ro.ase.cts.Parc.Categorie;
import ro.ase.cts.Parc.Item;

public class Main {
    public static void main(String[] args) {
        
        IParc cFile = new Categorie("File");
        IParc cParc = new Categorie("Parc");
        
        IParc iOpen = new Item("Open");
        IParc iSave = new Item("Save");
        IParc iPlimbare = new Item("Plimbare parc");
        IParc iDestinatie = new Item("Destinatie parc");
        
        try {
            
            cParc.adaugaNod(iPlimbare);
            cParc.adaugaNod(iDestinatie);
            
            cFile.adaugaNod(iOpen);
            cFile.adaugaNod(iSave);
            cFile.adaugaNod(cParc);
            
            cFile.stergeNod(iSave);
            
            cFile.info();
            
        } catch(Exception e) {
            
            e.printStackTrace();
            
        }
        
    }
    
}