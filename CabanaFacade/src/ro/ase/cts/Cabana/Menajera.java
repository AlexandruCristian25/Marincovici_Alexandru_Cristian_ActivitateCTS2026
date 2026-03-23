package ro.ase.cts.Cabana;

import java.util.Arrays;
import java.util.List;

public class Menajera {
    
    private List<Boolean> listaCamereCurate;
    
    public Menajera() {
        
        listaCamereCurate = new AreaysList<Boolean>();
        for(int i = 0; i < 8; i++) {
            
            listaCamereCurate.add(true);
            
        }
        
        for(int i = 8; i < 13; i++) {
            
            listaCamereCurate.add(false);
            
        }
        
    }
    
    public boolean esteCameraCurata(int nr) {
        
        return listaCamereCurate.get(nr);
        
    }
    
    public boolean areLenjeriiCurate(int nrCamera) {
        
        return listaCamereCurate.get(nrCamera);
        
    }
    
}