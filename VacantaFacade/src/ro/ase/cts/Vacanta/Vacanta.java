package ro.aze.cts.Vacanta;

import java.util.Arrays;
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
    
    public boolean rezervarePachet(String nume) {
        
        return listaPacheteVacanta.get(nume);
        
    }
    
    public boolean areDiscount(double pret) {
        
        return listaPacheteVacanta.get(pret);
        
    }
    
}