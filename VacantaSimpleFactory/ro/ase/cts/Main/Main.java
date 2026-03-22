package ro.ase.cts.Main;

import ro.ase.cts.Fabrica.TipVacanta;
import ro.ase.cts.Fabrica.VacantaFactory;
import ro.ase.cts.Vacanta.Vacanta;

public class Main {
    public static void main(String[] args) {
        
        VacantaFactory vacantaFactory = new VacantaFactory();
        
        Vacanta gratuita = vacantaFactory.getVacanta(TipVacanta.Gratuita, "Tokyo", 13500.90, 5);
        Vacanta compensata = vacantaFactory.getVacanta(TipVacanta.Compensata, "Seoul", 11900.90, 3);
        Vacanta partialPlatita = vacantaFactory.getVacanta(TipVacanta.PartialPlatita, "Beijing", 17800.90, 7);
        
        gratuita.afiseazaInfo();
        compensata.afiseazaInfo();
        partialPlatita.afiseazaInfo();
        
    }
}