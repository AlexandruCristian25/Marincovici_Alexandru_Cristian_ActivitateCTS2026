package ro.ase.cts.Cabana;

import ro.ase.cts.Cabana.CameraLibera;
import ro.ase.cts.Cabana.Menajera;
import ro.ase.cts.Cabana.Facade;

public class Main {
    public static void main(String[] args) {
        
        int nrCamera = 79;
        
        System.out.println(Facade.verificareDisponibilitateCamera(nrCamera));
        
    }
}