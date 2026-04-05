package ro.ase.cts.Main;

import ro.ase.cts.Companie.BazaDate;
import ro.ase.cts.Companie.Departament;
import ro.ase.cts.Companie.Item;

public class Main {
    public static void main(String[] args) {
        
        BazaDate dFisier = new Departament("Fisier");
        BazaDate dBirou = new Departament("Birou");
        
        BazaDate iOpen = new Item("Open");
        BazaDate iSave = new Item("Save");
        BazaDate iVizualizare = new Item("Vizualizare");
        BazaDate iEditare = new Item("Editare");
        BazaDate iCreazaBirou = new Item("Creare Birou");
        
        try {
            
            dBirou.adaugaAngajat(iVizualizare);
            dBirou.adaugaAngajat(iEditare);
            
            dFisier.adaugaAngajat(iOpen);
            dFisier.adaugaAngajat(iSave);
            dFisier.adaugaAngajat(dBirou);
            
            dFisier.stergeAngajat(iSave);
            dFisier.detalii();
            
        } catch(Exception e) {
            
            e.printStackTrace();
            
        }
        
    }
    
}