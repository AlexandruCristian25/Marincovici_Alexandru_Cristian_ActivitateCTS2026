package ro.ase.cts.Masina;

import java.util.ArrayList;
import java.util.List;

public class Masina {
    
    private List<String> listaMasini;
    
    public Masina() {
        
        listaMasini = new ArrayList<String>();
        for(int i = 0; i < 15; i++) {
            
            listaMasini.add(String.valueOf(i + 1));
            
        }
        
    }
    
    public boolean verificareMasina(String tipMasina) {
        
        return listaMasini.contains(tipMasina);
        
    }
    
}