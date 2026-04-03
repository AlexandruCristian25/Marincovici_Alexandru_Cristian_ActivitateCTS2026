package ro.ase.cts.Main;

import ro.ase.cts.Masina.Sofer;
import ro.ase.cts.Masina.Masina;
import ro.ase.cts.Masina.Facade;

public class Main {
    
    public static void main(String[] args) {
        
        String tipMasina = "1";
        
        System.out.println(Facade.verificareMasina(tipMasina));
        
    }
    
}