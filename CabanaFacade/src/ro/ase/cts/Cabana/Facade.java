package ro.ase.cts.Cabana;

import ro.ase.cts.Cabana.CameraLibera;
import ro.ase.cts.Cabana.Menajera;

public class Facade {
    
    public static boolean verificareCamera(int nrCamera) {
        
        CameraLibera libera = new CameraLibera();
        if(libera.verificareCameraLibera(nrCamera)) {
            
            Menajera menajera = new Menajera();
            if(menajera.esteCameraCurata(nrCamera) && menajera.areAsternuturiNoi(nrCamera)) {
                
                return true;
                
            } else {
                
                return false;
                
            }
            
        } else {
            
            return false;
            
        }
        
    }
    
    public static String verificareDisponibilitateCamera(int nrCamera) {
        
        CameraLibera libera = new CameraLibera();
        if(libera.verificareCameraLibera(nrCamera)) {
            
            Menajera menajera = new Menajera();
            if(menajera.esteCameraCurata(nrCamera) && menajera.areAsternuturiCurate(nrCamera)) {
                
                return "Camera este curata";
                
            } else {
                
                return "Camera este in pregatire";
                
            }
            
        } else {
            
            return "Camera este in pregatire";
                
        }
        
    }
    
}