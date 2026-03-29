package ro.ase.cts.Main;

import ro.ase.cts.Hotel.Rezervare;
import ro.ase.cts.Hotel.Categorie;
import ro.ase.cts.Hotel.Item;

public class Main {
    public static void main(String[] args) {
        
        Rezervare rFisier = new Categorie("Fisier");
        Rezervare rCamere = new Categorie("Camere");
        Rezervare rOferta = new Categorie("Oferta");
        
        Rezervare iOpen = new Item("Open");
        Rezervare iSave = new Item("Save");
        Rezervare iVizualizare = new Item("Vizualizare");
        Rezervare iEditare = new Item("Editare");
        Rezervare iOferta = new Item("Oferta");
        Rezervare iCreareOferta = new Item("Creare oferta");
        
        try {
            
            cCamere.adaugaRezervare(iVizualizare);
            cCamere.adaugaRezervare(iEditare);
            
            cOferta.adaugaNod(iOferta);
            cOferta.adaugaNod(iCreazaOferta);
            
            cFisier.adaugaNod(iOpen);
            cFisier.adaugaNod(iSave);
            cFisier.adaugaNod(cCamere);
            cFisier.adaugaNod(cOferta);
            
            cFisier.stergeNod(iSave);
            cOferta.adaugaNod(iSave);
            
            cFile.deecriere();
            
        } catch(Exception e) {
            
            e.printStackTrace();
            
        }
        
    }
}