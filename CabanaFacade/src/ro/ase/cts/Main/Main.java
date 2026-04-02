package ro.ase.cts.Main;

import ro.ase.cts.Cabana.Facade;

public class Main {
    public static void main(String[] args) {

        int nrCamera = 5;

        System.out.println(Facade.verificaDisponibilitateCamera(nrCamera));

    }
}
