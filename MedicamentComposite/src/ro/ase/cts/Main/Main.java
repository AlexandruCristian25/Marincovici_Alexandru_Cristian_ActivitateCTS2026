package ro.ase.cts.Main;

import ro.ase.cts.Medicament.Categorie;
import ro.ase.cts.Medicament.Sectiune;
import ro.ase.cts.Medicament.Medicament;

public class Main {
    public static void main(String[] args) {
        
        Sectiune categorieRaceala = new Categorie("Raceala");
        Sectiune categorieDurere = new Categorie("Durere");
        Sectiune categorieAntibiotice = new Categorie("Antibiotice");
        
        Sectiune medicamentCopii = new Medicament("Copii");
        Sectiune medicamentAdulti = new Medicament("Adulti");
        
        try {
            
            categorieRaceala.adaugareMedicament(medicamentCopii);
            categorieRaceala.adaugareMedicament(medicamentAdulti);
            
            categorieRaceala.adaugareMedicament(categorieDurere);
            categorieRaceala.adaugareMedicament(categorieAntibiotice);
            
            categorieRaceala.stergeMedicament(categorieAntibiotice);
            
            categorieRaceala.info();
            
        } catch(Exception e) {
            
            e.printStackTrace();
            
        }
        
    }
    
}