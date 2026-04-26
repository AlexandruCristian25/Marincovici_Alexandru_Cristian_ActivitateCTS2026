package ro.ase.cts.Bloc;

import java.util.ArrayList;
import java.util.List;

public class Apartament {

    private List<Boolean> listaApartamente;

    public Apartament() {
        
        listaApartamente = new ArrayList<>();

        for (int i = 0; i < 60; i++) {
            
            listaApartamente.add(true);
            
        }

        for (int i = 60; i < 80; i++) {
            
            listaApartamente.add(false);
            
        }
        
    }

    public boolean esteApartament(int nr) {
        
        if (nr >= 0 && nr < listaApartamente.size()) {
            
            return listaApartamente.get(nr);
            
        }
        
        return false;
    }
    
}