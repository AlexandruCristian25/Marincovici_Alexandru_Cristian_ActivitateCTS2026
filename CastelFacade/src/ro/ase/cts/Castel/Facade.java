package ro.ase.cts.Castel;

import ro.ase.cts.Castel.Camera;
import ro.ase.cts.Castel.Paznic;

public class Facade {
    
    public static boolean verificaCamera(int nrCamera) {
        
        Camera camera = new Camera();
        if(camera.verificareCamera(nrCamera)) {
            
            Paznic paznic = new Paznic();
            if(paznic.cameraLibera(nrCamera) && paznic.areGeam(nrCamera)) {
                
                return true;
                
            } else {
                
                return false;
                
            }
            
        } else {
            
            return false;
            
        }
        
    }
    
    public static String verificaDisponibilitateCamera(int nrCamera) {
        
        Camera camera = new Camera();
        if(camera.verificareCamera(nrCamera)) {
            
            Paznic paznic = new Paznic();
            if(paznic.cameraLibera(nrCamera) && paznic.areGeam(nrCamera)) {
                
                return "Camera libera";
                
            } else {
                
                return "Camera in curs de pregatire";
                
            }
            
            
        } else {
            
            return "Camera este ocupata";
            
        }
        
    }
    
}