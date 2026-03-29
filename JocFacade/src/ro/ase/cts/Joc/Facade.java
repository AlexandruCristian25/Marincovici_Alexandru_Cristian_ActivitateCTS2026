package ro.ase.cts.Joc;

import ro.ase.cts.Joc.JocAchizitionat;
import ro.ase.cts.Joc.Producator;

public class Facade {
    
    public static boolean verificareJoc(int pret) {
        
        JocAchizitionat joc = new JocAchizitionat();
        
        if(joc.jocNou(pret) && joc.jocVechi(pret)) {
            
            return true;
            
        } else {
            
            return false;
            
        }
        
    } else {
        
        return false;
        
    }
    
    public static String verificareDisponibilitateJoc(int pret) {
        
        JocAchizitionat joc = new JocAchizitionat();
        
        if(joc.jocNou(pret) && joc.jocVechi(pret)) {
            
            return "Joc nou";
            
        } else {
            
            return "Joc vechi";
            
        }
        
    } else {
        
        return "Joc vechi";
        
    }
    
}