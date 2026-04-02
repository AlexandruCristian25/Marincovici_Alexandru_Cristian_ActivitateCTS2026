package ro.ase.cts.Camera;

public abstract class Decorator implements ICamera {
    
    protected Camera camera;
    protected int procent;
    
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