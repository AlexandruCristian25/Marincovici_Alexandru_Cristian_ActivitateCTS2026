package ro.ase.cts.Masina;

import ro.ase.cts.Masina.Sofer;
import ro.ase.cts.Masina.Masina;

public class Facade {
    
    public static boolean verificareMasina(String tipCamera) {
        
        Masina masina = new Masina();
        if(masina.verificareMasina(tipMasina)) {
            
            Sofer sofer = new Sofer();
            if(sofer.esteMasinaNoua(tipMasina) && sofer.areRotiNoi(tipMasina)) {
                
                return true;
                
            } else {
                
                return false;
                
            }
            
        } else {
            
            return false;
            
        }
        
    }
    
    public static String verificareMasina(String tipMasina) {
        
        Masina masina = new Masina();
        if(masina.verificareMasina(tipMasina)) {
            
            Sofer sofer = new Sofer();
            if(sofer.esteMasinaNoua(tipMasina) && sofer.areRotiNoi(tipMasina)) {
                
                return "Masina este noua";
                
            } else {
                
                return "Masina este second hand";
                
            }
            
        } else {
            
            return "Masina este second hand";
            
        }
        
    }
    
}