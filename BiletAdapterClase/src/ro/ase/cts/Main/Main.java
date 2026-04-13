package ro.ase.cts.Main;

import ro.ase.cts.Bilet.IBilet;
import ro.ase.cts.Bilet.Bilet;
import ro.ase.cts.Bilet.RezervareBilet;

public class Main {
    public static void main(String[] args) {

        IBilet bilet = new RezervareBilet();
        bilet.rezervaBilet();
        bilet.detalii();

        Bilet bilet1 = new Bilet("Alina", 45.99);
        System.out.println(bilet1.toString());

        System.out.println("");
        System.out.println("Se utilizeaza adapterul: ");

        Bilet bilet2 = new Bilet("Matei", 25.99);
        System.out.println(bilet2.toString());
        
    }
    
}