package ro.ase.cts.Main;

import ro.ase.cts.Camera.Camera;
import ro.ase.cts.Camera.Decorator;
import ro.ase.cts.Camera.CameraDecorata;

public class Main {
    public static void main(String[] args) {
        
        Camera camera = new Camera("Camera twin", 3500.90);
        camera.afiseazaDetalii();
        
        Decorator cameraDecorata = new CameraDecorata(camera);
        
        cameraDecorata.aplicaDoscount(20);
        cameraDecorata.afiseazaDetalii();
        
    }
}