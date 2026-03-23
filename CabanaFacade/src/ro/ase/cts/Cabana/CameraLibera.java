package ro.ase.cts.Cabana;

import java.util.Arrays;
import java.util.List;

public class CameraLibera {
    
    private List<Integer> listaCamereLibere;
    
    public CameraLibera() {
        
        listaCamereLibere = new ArrayList<Integer>();
        for(int i = 0; i < 11; i++) {
            
            listaCamereLibere.add(i + 1);
            
        }
        
    }
    
    public boolean verificareCameraLibera(int nrCamera) {
        
        return  listaCamereLibere.contains(nrCamera);
        
    }
    
}