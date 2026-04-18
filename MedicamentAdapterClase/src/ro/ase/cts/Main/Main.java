package ro.ase.cts.Main;

import ro.ase.cts.Medicament.MedicamentSpital;
import ro.ase.cts.Medicament.PachetSpital;
import ro.ase.cts.Medicament.Medicament;

public class Main {
    
    public static void prezintaReteta(MedicamentSpital medicamentSpital) {
        
        System.out.println("Pentru spital: ");
        medicamentSpital.achizitioneazaMedicament();
        
        System.out.println("Pentru pacient: ");
        medicamentSpital.prezintaReteta();
    }

    public static void main(String[] args) {
        
        MedicamentSpital pachetSpital = new PachetSpital();
        prezintaReteta(pachetSpital);
        
        
        System.out.println("Se doreste prezentarea pachetului spital + reteta");
        
        System.out.println("Utilizare reteta: ");
        
        Medicament medicament = new Medicament("Paracetamol", 20.99);
        System.out.println(medicament.toString());
        
    }
    
}