package ro.ase.cts.Hotel;

public class Camera {

    private int nrCamera;
    private Stare stare;

    public Camera(int nrCamera) {
        this.nrCamera = nrCamera;
        this.stare = new CameraLibera();
    }

    public void setStare(Stare stare) {
        this.stare = stare;
    }

    public int getNrCamera() {
        return nrCamera;
    }

    public void rezervaCamera() {
        stare.rezervaCamera(this);
    }

    public void ocupaCamera() {
        stare.ocupaCamera(this);
    }

    public void eliberareCamera() {
        stare.elibereazaCamera(this);
    }
    
}