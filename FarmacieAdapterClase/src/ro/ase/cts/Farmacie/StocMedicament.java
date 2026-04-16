package ro.ase.cts.Farmacie;

public class StocMedicament implements IMedicament {
    
    @Override
    public void setareMedicament() {
        
        System.out.println("Stare medicamente concluzionata");
        
    }
    
    @Override
    public void verificareDisponibilitate() {
        
        System.out.println("A fost realizareta verificarea medicamentelor");
        
    }
    
}