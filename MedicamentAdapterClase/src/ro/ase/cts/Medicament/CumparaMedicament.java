package ro.ase.cts.Medicament;

public class CumparaMedicament {
    
    private Medicament medicament;
    
    public CumparaMedicament(Medicament medicament) {
        this.medicament = medicament;
    }
    
    public void cumparaMedicament() {
        System.out.println("a fost achizitionat medicamentul " + medicament.toString());
    }
    
    @Override
    public String toString() {
        return "CumparaMedicament [medicament=" + medicament + "]";
    }
    
}