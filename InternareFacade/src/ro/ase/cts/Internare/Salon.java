package ro.ase.cts.Internare;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    
    private int nrSalon;
    private int nrPaturi;
    private List<Integer> listaSaloane;
    
    public Salon(int nrSalon, int nrPaturi) {
        this.nrSalon = nrSalon;
        this.nrPaturi = nrPaturi;
    }
    
    public Salon() {
        listaSaloane = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            
            listaSaloane.add(i + 1);
            
        }
        
    }
    
    public boolean verificareSalon(int nrSalon) {
        return listaSaloane.contains(nrSalon);
    }
    
}