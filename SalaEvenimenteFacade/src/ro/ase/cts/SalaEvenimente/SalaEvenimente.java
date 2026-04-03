package ro.ase.cts.SalaEvenimente;

import java.util.ArrayList;
import java.util.List;

public class SalaEvenimente {
    
    public List<Integer> listaSali;
    
    public SalaEvenimente() {
        
        listaSali = new ArrayList<Integer>();
        for(int i = 0; i < 60; i++) {
            listaSali.add(i + 1);
        }
        
    }
    
    public boolean verifcareSalaLibera(int nrMese) {
        return listaSali.contains(nrMese);
    }
    
}