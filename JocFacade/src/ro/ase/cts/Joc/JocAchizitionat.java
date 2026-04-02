package ro.ase.cts.Joc;

import java.util.ArrayList;
import java.util.List;

public class JocAchizitionat {
    
    private List<Integer> listaJocuri;
    
    public JocAchizitionat() {
        listaJocuri = new ArrayList<Integer>();
        for(int i = 0; i < 9; i++) {
            listaJocuri.add(i + 1);
        }
    }
    
    public boolean verificareJoc(int pret) {
        return listaJocuri.contains(pret);
    }
    
}