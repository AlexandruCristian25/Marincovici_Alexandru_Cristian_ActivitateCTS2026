package ro.ase.cts.Autobuz;

import java.util.ArrayList;
import java.util.List;

public class Sofer {

    private List<Boolean> listaAutobuze;

    public Sofer() {  
        listaAutobuze = new ArrayList<Boolean>();

        for (int i = 0; i < 5; i++) {
            listaAutobuze.add(true);
        }

        for (int i = 5; i < 8; i++) {
            listaAutobuze.add(false);
        }
    }

    public boolean areButonActionareUsi(int usi) {
        return listaAutobuze.get(usi);
    }

    public boolean areButonActionareUsiUrgenta(int nrUsi) {
        return listaAutobuze.get(nrUsi);
    }
    
}