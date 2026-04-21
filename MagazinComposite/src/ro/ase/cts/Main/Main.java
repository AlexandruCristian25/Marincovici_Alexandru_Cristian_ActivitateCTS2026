package ro.ase.cts.Main;

import ro.ase.cts.Magazin.Magazin;
import ro.ase.cts.Magazin.Item;
import ro.ase.cts.Magazin.IMagazin;

public class Main {
    public static void main(String[] args) {
        
        IMagazin mFile = new Magazin("Magazin1");
        IMagazin mMagazin = new Magazin("SubMagazin");
        
        IMagazin iOpen = new Item("Open");
        IMagazin iSave = new Item("Save");
        IMagazin iVizualizareM = new Item("Vizualizare magazin");
        IMagazin iEditare = new Item("Editare");
        
        try {
            
            mMagazin.adaugaNod(iVizualizareM);
            mMagazin.adaugaNod(iEditare);
            
            mFile.adaugaNod(iOpen);
            mFile.adaugaNod(iSave);
            mFile.adaugaNod(mMagazin);
            
            mFile.stergeNod(iSave);
            
            mFile.descriere();
            
        } catch(Exception e) {
            
            e.printStackTrace();
            
        }
        
    }
    
}