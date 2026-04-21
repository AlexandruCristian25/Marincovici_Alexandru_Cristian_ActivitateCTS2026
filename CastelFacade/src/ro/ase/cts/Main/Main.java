package ro.ase.cts.Main;

import ro.ase.cts.Castel.Facade;

public class Main {
    public static void main(String[] args) {
        
        int nrCamera = 16;
        
        System.out.println(Facade.verificaDisponibilitateCamera(nrCamera));
        
    }
    
}