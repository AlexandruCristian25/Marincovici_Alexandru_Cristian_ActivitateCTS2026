package ro.ase.cts.SalaEvenimente;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    
    private List<Boolean> listaSali;
    
    public Manager() {
        
        listaSali = new ArrayList<Boolean>();
        
        for(int i = 0; i < 40; i++) {
            listaSali.add(true);
        }
        
        for(int i = 40; i < 70; i++) {
            listaSali.add(false);
        }
        
    }
    
    public boolean esteSalaLibera(int nr) {
        return listaSali.get(nr);
    }
    
    public boolean areMeseLibere(int nrMese) {
        return listaSali.get(nrMese);
    }
    
}