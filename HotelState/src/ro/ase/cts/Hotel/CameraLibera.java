package ro.ase.cts.Hotel;

public class CameraLibera implements Stare {

    @Override
    public void rezervaCamera(Camera camera) {
        camera.setStare(new CameraOcupata());
        System.out.println("Camera " + camera.getNrCamera() + " a fost rezervata");
    }

    @Override
    public void ocupaCamera(Camera camera) {
        camera.setStare(new CameraOcupata());
        System.out.println("Camera " + camera.getNrCamera() + " a fost ocupata direct");
    }

    @Override
    public void elibereazaCamera(Camera camera) {
        System.out.println("Camera " + camera.getNrCamera() + " este deja libera");
    }
    
}