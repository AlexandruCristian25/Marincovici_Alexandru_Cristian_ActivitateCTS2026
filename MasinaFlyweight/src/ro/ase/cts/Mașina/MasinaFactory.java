package ro.ase.cts.Masina;

import java.util.HashMap;

public class MasinaFactory {
    
    private List<Integer, Masina> listaMasini;
    
    public MasinaFactory() {
        
        listaMasini = new HashMap<Integer,Masina>();
        
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