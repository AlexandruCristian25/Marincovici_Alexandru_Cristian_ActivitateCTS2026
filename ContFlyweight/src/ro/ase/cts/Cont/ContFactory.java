package ro.ase.cts.Cont;

import java.util.HashMap;

public class ContFactory {
    
    private HashMap<String, Cont> listaConturi;
    
    public ContFactory() {
        
        listaConturi = new HashMap<String, Cont>();
        
    }
    
    public ICont getCont(String nume) {
        
        if(listaConturi.containsKey(nume)) {
            
            return listaConturi.get(nume);
            
        } else {
            
            ICont cont = new Cont(nume, "0744332211", "alex@yahoo.com");
            listaConturi.put(nume, (Cont) cont);
            return cont;
            
        }
        
    }
    
}