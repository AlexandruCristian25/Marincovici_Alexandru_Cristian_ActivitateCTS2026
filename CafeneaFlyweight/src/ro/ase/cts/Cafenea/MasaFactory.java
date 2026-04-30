package ro.ase.cts.Cafenea;

import java.util.HashMap;

public class MasaFactory {

    private HashMap<Integer, Masa> listaMese;

    public MasaFactory() {
        listaMese = new HashMap<>();
    }

    public IMasa getMasa(int nrMasa) {
        
        if (listaMese.containsKey(nrMasa)) {
            return listaMese.get(nrMasa);
            
        } else {
            
            IMasa masa = new Masa(nrMasa, 4);
            listaMese.put(nrMasa, (Masa) masa);
            return masa;
            
        }
        
    }
    
}