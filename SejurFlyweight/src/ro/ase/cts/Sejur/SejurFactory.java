package ro.ase.cts.Sejur;

import java.util.HashMap;

public class SejurFactory {
    
    private HashMap<String, Sejur> listaSejururi;
    
    public SejurFactory() {
        
        listaSejururi = new HashMap<String, Sejur>();
        
    }
    
    public ISejur getSejur(String operator) {
        
        if(listaSejururi.containsKey(operator)) {
            
            return listaSejururi.get(operator);
            
        } else {
            
            ISejur sejur = new Sejur(operator, "Locatie1", "Oferta1");
            listaSejururi.put(operator, (Sejur) sejur);
            return sejur;
            
        }
        
    }
    
}