package ro.ase.cts.Main;

import ro.ase.cts.Hotel.ICamera;
import ro.ase.cts.Hotel.CameraFactory;
import ro.ase.cts.Hotel.Rezervare;

public class Main {
    public static void main(String[] args) {
        
        Rezervare rezervareIoana = new Rezervare("Ioana", 5);
        Rezervare rezervareStefania = new Rezervare("Stefania", 2);
        Rezervare rezervareMihaela = new Rezervare("Mihaela", 8);
        
        CameraFactory factory = new CameraFactory();
        
        ICamera camera2 = factory.getCamera(2);
        camera2.tipareste(rezervareStefania);
        factory.getCamera(2).tipareste(rezervareIoana);
        factory.getCamera(3).tipareste(rezervareMihaela);
        
    }
    
}