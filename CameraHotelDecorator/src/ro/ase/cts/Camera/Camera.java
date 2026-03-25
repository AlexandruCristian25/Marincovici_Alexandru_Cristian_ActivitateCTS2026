package ro.ase.cts.Camera;

public class Camera implements ICamera {
    
    private String tipCamera;
    private double pret;
    
    public Camera(String tipCamera, double pret) {
        
        super();
        this.tipCamera = tipCamera;
        this.pret = pret;
        
    }
    
    public void afiseazaDetalii() {
        
        System.out.println("Camera de tipul " + tipCamera + " are pretul de " + pret + " RON");
        
    }
    
    public String getTipCamera() {
        
        return tipCamera;
        
    }
    
    public void setTipCamera(String tipCamera) {
        
        this.tipCamera = tipCamera;
        
    }
    
    public double getPret() {
        
        return pret;
        
    }
    
    public void setPret(double pret) {
        
        this.pret = pret;
        
    }
    
}