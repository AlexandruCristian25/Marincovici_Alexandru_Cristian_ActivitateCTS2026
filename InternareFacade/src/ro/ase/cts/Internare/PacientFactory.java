package ro.ase.cts.Internare;

import java.util.HashMap;

public class PacientFactory {
    
    private HashMap<Integer, Salon> listaSaloane;
    
    public PacientFactory() {
        listaSaloane = new HashMap<Integer, Salon>();
    }
    
    public Salon getPacient(int nrSalon) {
        
        if(listaSaloane.containsKey(nrSalon)) {
            
            return listaSaloane.get(nrSalon);
            
        } else {
            
            Salon salon = new Salon(nrSalon, 12);
            listaSaloane.put(nrSalon, salon);
            return salon;
            
        }
        
    }
    
}