package ro.ase.cts.Vacanta;

public class Facade {
    
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