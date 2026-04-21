package ro.ase.cts.Castel;

import java.util.ArrayList;
import java.util.List;

public class Paznic {
    
    private List<Boolean> listaCamere;
    
    public Paznic() {
        
        listaCamere = new ArrayList<Boolean>();
        for(int i = 0; i < 10; i++) {
            
            listaCamere.add(true);
            
        }
        
        for(int i = 10; i < 20; i++) {
            
            listaCamere.add(false);
            
        }
        
    }
    
    public boolean cameraLibera(int nr) {
        return listaCamere.get(nr - 1);
    }
    
    public boolean areGeam(int nrCamera) {
        return listaCamere.get(nrCamera - 1);
    }
    
}