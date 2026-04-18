package ro.ase.cts.Medicament;

public class PachetSpital implements MedicamentSpital {
    
    @Override
    public void achizitioneazaMedicament() {
        
        System.out.println("Medicament achizitionat");
        
    }
    
    @Override
    public void prezintaReteta() {
        
        System.out.println("Reteta prezentata");
        
    }
    
}