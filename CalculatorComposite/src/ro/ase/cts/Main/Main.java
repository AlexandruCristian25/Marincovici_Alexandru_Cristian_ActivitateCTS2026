package ro.ase.cts.Main;

import Calculator.Calculator.Categorie;
import Calculator.Calculator.Element;
import Calculator.Calculator.Optiune;

public class Main {
    
    public static void main(String[] args) {
        
        Optiune cModel = new Categorie("Model");
        Optiune cRAM = new Categorie("RAM");
        Optiune cPret = new Categorie("Pret");
        
        Optiune iDeschis = new Element("Deschis");
        Optiune iSalvare = new Element("Salvare");
        Optiune iVizualizare = new Element("Vizualizare componente");
        Optiune iEditare = new Element("Editare componente");
        Optiune iOferta = new Element("Oferta Black Friday");
        Optiune iCreeazaPC = new Element("Creaza PC");
        
        try {
            
            cCalculator.adaugaNod(iVizualizare);
            cCalculator.adaugaNod(iEditare);
            
            cCalculator.adaugaNod(iOferta);
            cCalculator.adaugaNod(iCreazaPC);
            
            cModel.adaugaNod(iDeschidere);
            cModel.adaugaNod(iSalvare);
            cModel.adaugaNod(cCalculator);
            cModel.adaugaNod(cOferta);
            
            cModel.stergeNod(iSalvare);
            cOferta.adaugaNod(iSalvare);
            
            cModel.descriere();
            
        } catch(Exception e) {
            
            e.printStackTrace();
            
        }
        
    }
    
}