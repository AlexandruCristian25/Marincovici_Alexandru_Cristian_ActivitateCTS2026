package ro.ase.cts.Main;

import ro.ase.cts.Farmacie.IMedicament;
import ro.ase.cts.Farmacie.StocMedicament;
import ro.ase.cts.Farmacie.Medicament;

public class Main {
    
    public static void verificaStocPentruMedicament(IMedicament iMedicament) {
        System.out.println("Setare medicament:");
        iMedicament.setareMedicament();
        
        System.out.println("Verificare disponibilitate:");
        iMedicament.verificareDisponibilitate();
    }

    public static void main(String[] args) {
        
        IMedicament medicamentStoc = new StocMedicament();
        verificaStocPentruMedicament(medicamentStoc);
        
        System.out.println("Se face verificarea medicamentelor...");
        
        System.out.println("Setare medicament");
        Medicament medicament1 = new Medicament(24, true);
        System.out.println(medicament1.toString());
        
        System.out.println("Verificare disponibilitate medicament");
        Medicament medicament2 = new Medicament(13, false);
        System.out.println(medicament2.toString());
        
    }
    
}