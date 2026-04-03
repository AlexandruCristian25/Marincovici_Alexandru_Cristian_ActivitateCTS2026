package ro.ase.cts.Vacanta;

import java.util.ArrayList;
import java.util.List;

public class Destinatie {
    
    private List<Integer> listaPacheteVacanta;
    
    public Destinatie() {
        
        listaPacheteVacanta = new ArrayList<Integer>();
        for(int i = 0; i < 12; i++) {
            listaPacheteVacanta.add(i + 1);
        }
    }
    
    public boolean verificarePretPachet(double pret) {
        return listaPacheteVacanta.contains((int) pret);
    }
    
}