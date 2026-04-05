package ro.ase.cts.Casa;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    
    private List<String> listaCamere;
    
    public Casa() {
        
        listaCamere = new ArrayList<String>();
        for(int i = 0; i < 25; i++) {
            listaCamere.add("Locatie" + (i + 1));
        }
        
    }
    
    public boolean verificareCasa(String locatieCasa) {
        return listaCamere.contains(locatieCasa);
    }
    
}