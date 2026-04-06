package ro.ase.cts.Main;

import ro.ase.cts.Hotel.Camera;

public class Main {
    public static void main(String[] args) {

        Camera camera = new Camera(67);

        camera.eliberareCamera();
        camera.rezervaCamera();
        camera.ocupaCamera();
        camera.eliberareCamera();
        camera.eliberareCamera();
        camera.rezervaCamera();
    }
    
}