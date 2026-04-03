package ro.ase.cts.Vacanta;

import java.util.ArrayList;
import java.util.List;

public class Vacanta {
    
    private List<Boolean> listaPacheteVacanta;
    
    public Vacanta() {
        
        listaPacheteVacanta = new ArrayList<Boolean>();
        
        for(int i = 0; i < 10; i++) {
            
            listaPacheteVacanta.add(true);
            
        }
        
        for(int i = 10; i < 17; i++) {
            
            listaPacheteVacanta.add(false);
            
        }
        
    }
    
    public boolean rezervarePachet(double pret) {
        
        int index = (int) pret;
        if(index >= 0 && index < listaPacheteVacanta.size()) {
            
            return listaPacheteVacanta.get(index);
            
        } else {
            
            return false;
            
        }
        
    }
    
    public boolean areDiscount(double pret) {
        
        int index = (int) pret;
        if(index >= 0 && index < listaPacheteVacanta.size()) {
            
            return listaPacheteVacanta.get(index);
            
        } else {
            
            return false;
            
        }
        
    }
    
}