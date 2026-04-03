package ro.ase.cts.Nava;

import java.util.HashMap;

public class NavaFactory {
    
    private HashMap<String, Nava> listaNave;
    
    public NavaFactory() {
        
        listaNave = new HashMap<String, Nava>();
        
    }
    
    public INava getNava(String tipCamera) {
        
        if(listaNave.containsKey(tipCamera)) {
            
            return listaNave.get(tipCamera);
            
        } else {
            
            INava nava = new Nava(tipCamera, "Nava1", "Data1");
            listaNave.put(tipCamera, (Nava) nava);
            return nava;
            
        }
        
    }
    
}