package ro.ase.cts.Main;

import ro.ase.cts.Casa.Facade;

public class Main {
    public static void main(String[] args) {
        
        String locatieCasa = "Locatie3";
        
        System.out.println(Facade.verificaDisponibilitateCasa(locatieCasa));
        
    }
    
}