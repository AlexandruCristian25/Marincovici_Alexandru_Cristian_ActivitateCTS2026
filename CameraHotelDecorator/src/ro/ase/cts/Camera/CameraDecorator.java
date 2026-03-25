package ro.ase.cts.Camera;

import ro.ase.cts.Camera.Camera;

public class CameraDecorator extends Decorator {
    
    public CameraDecorata(Camera camera) {
        
        super(camera);
        
    }
    
    @Override
    public void afiseazaDetalii() {
        
        super.camera.setPret(super.camera.getPret() * (100 - percent) / 100);
        
    }
    
}