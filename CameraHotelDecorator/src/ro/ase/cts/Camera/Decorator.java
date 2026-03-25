package ro.ase.cts.Camera;

import ro.ase.cts.Camera.Camera;

public abstract class Decorator implements ro.ase.cts.Camera.Camera {
    
    protected Camera camera;
    
    public Decorator(Camera camera) {
        
        this.camera = camera;
        
    }
    
    @Override
    public void afiseazaDetalii() {
        
        camera.afiseazaDetalii();
        System.out.println("Camera ocupata");
        
    }
    
    public abstract void aplicaDiscount(int procent);
    
}