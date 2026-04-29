package ro.ase.cts.Main;

import ro.ase.cts.Tramvai.Tramvai;
import ro.ase.cts.Tramvai.Statie;
import ro.ase.cts.Tramvai.Calator;

public class Main {
    public static void main(String[] args) {
        
        Tramvai statie = new Statie("Statie1");
        statie.vindeBilet();
        
        
        Tramvai statie2 = new Statie("Statie2")
        statie2.vindeBilet();
        
    }
    
}