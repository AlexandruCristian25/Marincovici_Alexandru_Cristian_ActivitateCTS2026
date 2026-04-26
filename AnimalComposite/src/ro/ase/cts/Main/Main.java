package ro.ase.cts.Main;

import ro.ase.cts.Animal.Specie;
import ro.ase.cts.Animal.Animal;
import ro.ase.cts.Animal.Item;

public class Main {
    public static void main(String[] args) {
        
        
        Specie cSpecie = new Animal("Caine");
        Specie cSpecie = new Animal("Pisica");
        Specie cSpecie = new Animal("Gaina");
        
        Specie iOpen = new Item("Animal domestic:");
        Specie iSave = new Item("Animal salbatic:");
        Specie iVizualizare = new Item("Mamifer");
        Specie iEdit = new Item("Reptila");
        
        try {
            
            cSpecie.adaugaNod(iVizualizare);
            cSpecie.adaugaNod(iEditare);
            
            cSpecie.adaugaNod(iOpen);
            cSpecie.adaugaNod(iSave);
            cSpecie.adaugaNod(cSpecie);
            
            cSpecie.stergeNod(iSave);
            
            cSpecie.detalii();
            
        } catch() {
            
            e.printStackTrace();
            
        }
        
    }
    
}