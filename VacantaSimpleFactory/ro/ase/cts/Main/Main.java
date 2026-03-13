package ro.ase.cts.Main;

import ro.ase.cts.Vacanta.Vacanta;

public class Main {
    public static void main(String[] args) {
        
        Vacanta vacanta = new Vacanta();
        
        Vacanta gratuita = vacanta.getVacanta(TipVacanta.Gratuita, "Tokyo", 13500.90, 5);
        Vacanta compensata = vacanta.getVacanta(TipVacanta.Compensata, "Seoul", 11900.90, 3);
        Vacanta partialPlatita = vacanta.getVacanta(TipVacanta.PartialPlatita, "Beijing", 17800.90, 7);
        
        gratuita.afiseazaInfo();
        compensata.afiseazaInfo();
        partialPlatita.afiseazaInfo();
        
    }
}