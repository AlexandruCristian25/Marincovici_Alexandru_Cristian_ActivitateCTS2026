package ro.ase.cts.Castel;

import java.util.ArrayList;
import java.util.List;

public class Camera {
    
    private List<Integer> listaCamere;
    
    public Camera() {
        
        listaCamere = new ArrayList<Integer>();
        for(int i = 0; i < 15; i++) {
            
            listaCamere.add(i + 1);
            
        }
        
    }
    
    public boolean verificareCamera(int nrCamera) {
        return listaCamere.contains(nrCamera);
    }
    
}