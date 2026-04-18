package ro.ase.cts.Autobuz;

import java.util.ArrayList;
import java.util.List;

public class Autobuz {

    private List<Integer> listaAutobuze;

    public Autobuz() {
        
        listaAutobuze = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            
            listaAutobuze.add(i + 1);
        }
        
    }

    public boolean verificareButonActionareUsi(int nrUsi) {
        
        return listaAutobuze.contains(nrUsi);
        
    }
    
}