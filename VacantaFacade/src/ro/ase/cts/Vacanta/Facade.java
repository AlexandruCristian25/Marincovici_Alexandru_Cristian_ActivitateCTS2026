package ro.ase.cts.Vacanta;

public class Facade {
    
    public static booleam verificarePretPachet(double pret) {
        
        PachetVacanta pachet = new PachetVacanta();
        if(pachet.verificarePretPachet(double pret)) {
            
            Vacanta vacanta = new Vacanta();
            if(vacanta.rezervarePachet(pret) && vacanta.areDiscount(pret)) {
                
                return true;
                
            } else {
                
                return false;
                
            }
            
        } else {
            
            return false;
            
        }
        
    }
    
    public static String verificarePretPachet(double pret) {
        
        Destinatie destinatie = new Destinatie();
        if(destinatie.verificarePretPachet(pret)) {
            
            Vacanta vacanta = new Vacanta();
            if(vacanta.rezervarePachet(pret) && vacanta.areDiscount(pret)) {
                
                return "Pachet vacanta rezervat";
                
            } else {
                
                return "Rezervare incompleta";
                
            }
            
        } else {
            
            return "Rezervare incompleta";
            
        }
        
    }
    
}