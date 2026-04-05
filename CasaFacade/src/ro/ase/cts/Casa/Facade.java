package ro.ase.cts.Casa;

public class Facade {
    
    public static boolean verificaCasa(String locatieCasa) {
        
        Casa casa = new Casa();
        if(casa.verificareCasa(locatieCasa)) {
            
            Proprietar proprietar = new Proprietar();
            if(proprietar.areEtaj(locatieCasa) && proprietar.areMansarda(locatieCasa)) {
                
                return true;
                
            } else {
                
                return false;
                
            }
            
        } else {
            
            return false;
            
        }
        
    }
    
    public static String verificaDisponibilitateCasa(String locatieCasa) {
        
        Casa casa = new Casa();
        if(casa.verificareCasa(locatieCasa)) {
            
            Proprietar proprietar = new Proprietar();
            if(proprietar.areEtaj(locatieCasa) && proprietar.areMansarda(locatieCasa)) {
                
                return "Casa cu etaj";
                
            } else {
                
                return "Casa nu are etaj";
                
            }
            
        } else {
            
            return "Casa nu exista";
            
        }
        
    }
    
}