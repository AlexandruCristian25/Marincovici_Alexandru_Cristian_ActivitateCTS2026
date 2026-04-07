package ro.ase.cts.Main;

import ro.ase.cts.Farmacist.Facade;

public class Main {
    public static void main(String[] args) {
        
        Facade facade = new Facade();
        facade.verificaReteta("Paracetamol");
        
    }
    
}