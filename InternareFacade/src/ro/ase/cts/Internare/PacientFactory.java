package ro.ase.cts.Internate;

import java.util.HashMap;

public class PacientFactory {
    
    private HashMap<Integer, Salon> listaSaloane;
    
    public PacientFactory() {
        
        listaSaloane = new HashMap<Integer, Salon>();
        
    }
    
    public IInternare getPacient(String nume) {
        
        if(listaSaloane.containsKey(nrSalon)) {
            
            return listaSaloane.get(nrSalon);
            
        } else {
            
            IInternare salon = new Salon(nrSalon, 12, 20);
            listaSaloane.put(nrSalon, (Salon) salon);
            return salon;
            
        }
        
    }
    
}