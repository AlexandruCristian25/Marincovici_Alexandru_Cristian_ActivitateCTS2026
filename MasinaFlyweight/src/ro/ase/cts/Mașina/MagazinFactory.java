package ro.ase.cts.Magazin;

import java.util.HashMap;

public class MagazinFactory {
    
    private HashMap<Integer, Magazin> listaMagazine;
    public MagazinFactory() {
        
        listaMagazine = new HashMap<Integer, Magazin>();
        
    }
    
    public IMagazin getMagazin(int nrAngajati) {
        
        if(listaMagazine.containsKey(nrAngajati)) {
            
            return listaMagazine.get(nrAngajati);
            
        } else {
            
            IMagazin magazin = new Magazin(nrAngajati, 4, 7, 8, 5);
            listaMagazine.put(nrAngajati, (Magazin) magazin);
            return magazin;
            
        }
        
    }
    
}