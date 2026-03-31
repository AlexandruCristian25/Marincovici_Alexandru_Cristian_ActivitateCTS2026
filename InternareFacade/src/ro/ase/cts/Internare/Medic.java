package ro.ase.cts.Internare;

import java.util.ArrayList;
import java.util.List;

public class Medic {
    
    private List<Boolean> listaPacienti;
    
    public Medic() {
        
        listaPacienti = new ArrayList<Boolean>();
        
        for(int i = 0; i < 7; i++) {
            
            listaPacienti.add(true);
            
        }
        
        for(int i = 7; i < 12; i++) {
            
            listaPacienti.add(false);
            
        }
        
    }
    
    public boolean esteGravaBoala(String nume) {
        
        return listaPacienti(nume);
        
    }
    
    public boolean esteVindecat(String nume) {
        
        return listaPacienti(nume);
        
    }
    
}