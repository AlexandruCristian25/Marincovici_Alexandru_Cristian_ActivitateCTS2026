package ro.ase.cts.Vapor;

import java.util.HashMap;

public class LocFactory {
    
    private HashMap<Integer, Loc> listaLocuri;
    
    public LocFactory() {
        listaLocuri = new HashMap<Integer, Loc>();
    }
    
    public ILoc getLoc(int nrLoc) {
        
        if(listaLocuri.containsKey(nrLoc)) {
            
            return listaLocuri.get(nrLoc);
            
        } else {
            
            ILoc loc = new Loc(nrLoc, 6);
            listaLocuri.put(nrLoc, (Loc) loc);
            return loc;
            
        }
        
    }
    
}