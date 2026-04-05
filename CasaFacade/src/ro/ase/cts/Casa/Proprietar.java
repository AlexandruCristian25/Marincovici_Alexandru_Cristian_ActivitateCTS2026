package ro.ase.cts.Casa;

import java.util.ArrayList;
import java.util.List;

public class Proprietar {
    
    private List<Boolean> listaCamere;
    
    public Proprietar() {
        
        listaCamere = new ArrayList<Boolean>();
        for(int i = 0; i < 3; i++) {
            listaCamere.add(true);
        }
        
        for(int i = 3; i < 25; i++) {
            listaCamere.add(false);
        }
        
    }
    
    public boolean areEtaj(String locatie) {
        int index = Integer.parseInt(locatie.replaceAll("\\D", "")) - 1;
        return listaCamere.get(index);
    }
    
    public boolean areMansarda(String locatieCasa) {
        int index = Integer.parseInt(locatieCasa.replaceAll("\\D", "")) - 1;
        return listaCamere.get(index);
    }
    
}