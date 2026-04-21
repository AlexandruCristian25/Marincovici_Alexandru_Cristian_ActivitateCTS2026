package ro.ase.cts.Barca;

import java.util.HashMap;

public class BarcaFactory {
    
    private HashMap<Integer, Barca> listaBarci;
    
    public BarcaFactory() {
        
        listaBarci = new HashMap<Integer, Barca>();
        
    }
    
    public IBarca getBarca(int codBarca) {
        
        if(listaBarci.containsKey(codBarca)) {
            
            return listaBarci.get(codBarca);
            
        } else {
            
            IBarca barca = new Barca(codBarca, 45, 2500);
            listaBarci.put(codBarca, (Barca) barca);
            return barca;
            
        }
        
    }
    
}