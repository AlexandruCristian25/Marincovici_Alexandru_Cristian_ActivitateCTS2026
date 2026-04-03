package ro.ase.cts.Internare;

public class Facade {
    
    public static boolean verificareDisponibilitateSalon(int nrSalon) {
        
        Salon salon = new Salon();
        Medic medic = new Medic();
        
        return salon.verificareSalon(nrSalon) && medic.esteGravaBoala("Rezultat testare");
        
    }
    
}