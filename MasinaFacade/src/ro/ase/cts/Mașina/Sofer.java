package ro.ase.cts.Masina;

import java.util.ArrayList;
import java.util.List;

public class Sofer {
    
    private List<Boolean> listaMasini;
    
    public Sofer() {
        
        listaMasini = new ArrayList<Boolean>();
        for(int i = 0; i < 10; i++) {
            
            listaMasini.add(true);
            
        }
        
        for(int i = 10; i < 19; i++) {
            
            listaMasini.add(false);
            
        }
        
    }
    
    public boolean esteMasinaNoua(String tip) {
        int index = Integer.parseInt(tip) - 1;
        return listaMasini.get(index);
    }
    
    public boolean areRotiNoi(String tipMasina) {
        int index = Integer.parseInt(tipMasina) - 1;
        return listaMasini.get(index);
    }
    
}