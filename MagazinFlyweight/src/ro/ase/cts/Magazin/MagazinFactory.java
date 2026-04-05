package ro.ase.cts.Magazin;

import java.util.HashMap;

public class MagazinFactory {
    
    private HashMap<Integer, Magazin> listaMagazine;
    
    public MagazinFactory() {
        listaMagazine = new HashMap<>();
    }
    
    public IMagazin getMagazin(int nrAngajati) {
        
        if(listaMagazine.containsKey(nrAngajati)) {
            return listaMagazine.get(nrAngajati);
        } else {
            IMagazin magazin = new Magazin("Magazin_" + nrAngajati, nrAngajati, 100);
            listaMagazine.put(nrAngajati, (Magazin) magazin);
            return magazin;
        }
        
    }
    
}