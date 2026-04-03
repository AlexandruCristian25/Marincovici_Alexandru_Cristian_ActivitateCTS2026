package ro.ase.cts.SalaEvenimente;

public class Facade {
    
    public static boolean verificaSala(int nrMese) {
        
        SalaEvenimente sala = new SalaEvenimente();
        if(sala.verifcareSalaLibera(nrMese)) {
            
            Manager manager = new Manager();
            if(manager.esteSalaLibera(nrMese) && manager.areMeseLibere(nrMese)) {
                return true;
            } else {
                return false;
            }
            
        } else {
            return false;
        }
        
    }
    
    public static String verificaDisponibilitateSala(int nrMese) {
        
        SalaEvenimente sala = new SalaEvenimente();
        if(sala.verifcareSalaLibera(nrMese)) {
            
            Manager manager = new Manager();
            if(manager.esteSalaLibera(nrMese) && manager.areMeseLibere(nrMese)) {
                return "Sala evenimente libera";
            } else {
                return "Sala evenimente ocupata";
            }
            
        } else {
            return "Sala evenimente ocupata";
        }
        
    }
    
}