package ro.ase.cts.ContBancar;

import java.util.ArrayList;
import java.util.List;

public class Banca {

    private List<Boolean> listaBanci;

    public Banca() {
        
        listaBanci = new ArrayList<>();
        
        for (int i = 0; i < 20; i++) {
            
            listaBanci.add(i % 2 == 0);
            
        }
        
    }

    public boolean verificaPersoana(boolean areCazier) {
        
        return !areCazier;
        
    }
    
}