package ro.ase.cts.Joc;

import java.util.ArrayList;
import java.util.List;

public class Producator {
    
    private List<Boolean> listaJocuri;
    
    public Producator() {
        
        listaJocuri = new ArrayList<Boolean>();
        
        for(int i = 0; i < 4; i++) {
            listaJocuri.add(true);
        }
        
        for(int i = 4; i < 9; i++) {
            listaJocuri.add(false);
        }
    }
    
    public boolean jocNou(int pret) {
        return listaJocuri.get(pret - 1);
    }
    
    public boolean jocVechi(int pret) {
        return !listaJocuri.get(pret - 1);
    }
    
}