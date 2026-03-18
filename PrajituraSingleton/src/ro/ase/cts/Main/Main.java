package ro.ase.cts.Main;

import ro.ase.cts.Prajitura.Prajitura;

public class Main {
    public static void main(String[] args) {
        
        Prajitura p1 = Prajitura.getInstance();
        Prajitura p2 = Prajitura.getInstance();
        
        p1.setNume("Nume: Ecler");
        
        System.out.println(p1.getNume());
        
    }
}