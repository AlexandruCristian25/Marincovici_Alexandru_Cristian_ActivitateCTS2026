package ro.ase.cts.Masina;

import java.util.HashMap;
import java.util.Map;

public class MasinaFactory {
    
    private Map<Integer, Masina> listaMasini;
    
    public MasinaFactory() {
        
        listaMasini = new HashMap<Integer, Masina>();
        
    }
    
    public IMasina getMasina(int nrUsi) {
        
        if(listaMasini.containsKey(nrUsi)) {
            
            return listaMasini.get(nrUsi);
            
        } else {
            
            IMasina masina = new Masina(nrUsi, 4500);
            listaMasini.put(nrUsi, (Masina) masina);
            return masina;
            
        }
        
    }
    
}