package ro.ase.cts.Joc;

import java.util.HashMap;

public class JocFactory {
    
    private HashMap<Integer, Joc> listaJocuri;
    
    public JocFactory() {
        listaJocuri = new HashMap<>();
    }
    
    public IJoc getJoc(int pret) {
        
        if(listaJocuri.containsKey(pret)) {
            
            return listaJocuri.get(pret);
            
        } else {
            
            Joc joc = new Joc(pret, 12, 79);
            listaJocuri.put(pret, joc);
            return joc;
            
        }
        
    }
    
}