package ro.ase.cts.Hotel;

import java.util.HashMap;

public class CameraFactory {
    
    private HashMap<Integer, Camera> listaCamere;
    
    public CameraFactory() {
        
        listaCamere = new HashMap<Integer,Camera>();
        
    }
    
    public ICamera getCamera(int codCamera) {
        
        if(listaCamere.containsKey(codCamera)) {
            
            return listaCamere.get(codCamera);
            
        } else {
            
            ICamera camera = new Camera(codCamera, 4, 2, 7, 6);
            listaCamere.put(codCamera, (Camera) camera);
            return camera;
            
        }
        
    }
    
}