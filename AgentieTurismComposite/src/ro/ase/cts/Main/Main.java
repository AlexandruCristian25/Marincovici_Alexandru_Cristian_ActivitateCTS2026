package ro.ase.cts.Main;

import ro.ase.cts.Agentie.Categorie;
import ro.ase.cts.Agentie.Optiune;
import ro.ase.cts.Agentie.Element;

public class Main {
    public static void main(String[] args) {
        
        Optiune cFisier = new Categorie("Fisier");
        Optiune cCamere = new Categorie("Camere");
        Optiune cOferta = new Categorie("Oferta");
        
        Optiune eOpen = new Element("Open");
        Optiune eSave = new Element("Save");
        Optiune eVizualizare = new Element("Vizualizare");
        Optiune eEditare = new Element("Editare");
        Optiune eOfertaPaste = new Element("Oferta Paste");
        Optiune eCreazaOferta = new Element("Creare oferta");
        
        try {
            
            cCamere.adaugaNod(eVizualizare);
            cCamere.adaugaNod(eEditare);
            
            cOferta.adaugaNod(eOfertaPaste);
            cOferta.adaugaNod(eCreazaOferta);
            
            cFisier.adaugaNod(eOpen);
            cFisier.adaugaNod(eSave);
            cFisier.adaugaNod(cCamere);
            cFisier.adaugaNod(cOferta);
            
            cFisier.stergeNod(eSave);
            cOferta.adaugaNod(eSave);
            
            cFisier.descriere();
            
        } catch(Exception e) {
            
            e.printStackTrace();
            
        }
        
    }
}