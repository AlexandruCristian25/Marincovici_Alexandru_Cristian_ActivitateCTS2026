package ro.ase.cts.Hotel;

public class CameraOcupata implements Stare {

    @Override
    public void rezervaCamera(Camera camera) {
        System.out.println("Camera " + camera.getNrCamera() + " este deja ocupata");
    }

    @Override
    public void ocupaCamera(Camera camera) {
        System.out.println("Camera " + camera.getNrCamera() + " este deja ocupata");
    }

    @Override
    public void elibereazaCamera(Camera camera) {
        camera.setStare(new EliberareCamera());
        System.out.println("Camera " + camera.getNrCamera() + " se elibereaza");
    }
    
}