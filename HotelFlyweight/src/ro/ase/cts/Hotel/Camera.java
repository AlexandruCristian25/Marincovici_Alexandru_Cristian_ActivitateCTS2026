package ro.ase.cts.Camera;

public class Camera implements ICamera {
    
    private int codCamera;
    private int nrCamera;
    private int etaj;
    
    public Camera(int codCamera, int nrCamera, int etaj) {
        
        super();
        this.codCamera = codCamera;
        this.nrCamera = nrCamera;
        this.etaj = etaj;
        
    }
    
    @Override
    public void tiparire(Rezervare rezervare) {
        
        System.out.println(this.toString() + " " + rezervare.toString());
        
    }
    
    @Override
    public String toString() {
        
        return "Camera[ codCamera = " + codCamera + ", nrCamera = " + nrCamera + ", etaj = " + etaj + "]";
        
    }
    
}