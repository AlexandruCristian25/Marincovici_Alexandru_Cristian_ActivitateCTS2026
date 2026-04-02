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
            
            rCamere.adaugaRezervare(iVizualizare);
            rCamere.adaugaRezervare(iEditare);
            
            rOferta.adaugaRezervare(iOferta);
            rOferta.adaugaRezervare(iCreareOferta);
            
            rFisier.adaugaRezervare(iOpen);
            rFisier.adaugaRezervare(iSave);
            rFisier.adaugaRezervare(rCamere);
            rFisier.adaugaRezervare(rOferta);
            
            rFisier.stergeRezervare(iSave);
            rOferta.adaugaRezervare(iSave);
            
            rFisier.info();
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        
    }
    
}