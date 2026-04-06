package ro.ase.cts.Hotel;

public class EliberareCamera implements Stare {

    @Override
    public void rezervaCamera(Camera camera) {
        System.out.println("Camera " + camera.getNrCamera() + " este in curs de eliberare");
    }

    @Override
    public void ocupaCamera(Camera camera) {
        System.out.println("Camera " + camera.getNrCamera() + " este in curs de eliberare");
    }

    @Override
    public void elibereazaCamera(Camera camera) {
        camera.setStare(new CameraLibera());
        System.out.println("Camera " + camera.getNrCamera() + " este acum libera");
    }
    
}