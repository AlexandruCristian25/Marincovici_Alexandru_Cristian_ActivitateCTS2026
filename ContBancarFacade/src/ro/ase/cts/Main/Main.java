package ro.ase.cts.Main;

import ro.ase.cts.ContBancar.Facade;

public class Main {
    
    public static void main(String[] args) {

        boolean areCazier = false;

        System.out.println(Facade.verificaDisponibilitateBanca(areCazier));
        
    }
    
}