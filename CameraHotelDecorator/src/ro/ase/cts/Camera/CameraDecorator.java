package ro.ase.cts.Camera;

public class CameraDecorata extends Decorator {
    
    public CameraDecorata(Camera camera) {
        super(camera);
    }
    
    @Override
    public void aplicaDiscount(int procent) {
        this.procent = procent;
    }
    
    @Override
    public void afiseazaDetalii() {
        double pretNou = camera.getPret() * (100 - procent) / 100;
        System.out.println("Camera de tipul " + camera.getTipCamera() + 
                           " are pretul redus de " + pretNou + " RON");
        System.out.println("Camera ocupata");
    }
    
}