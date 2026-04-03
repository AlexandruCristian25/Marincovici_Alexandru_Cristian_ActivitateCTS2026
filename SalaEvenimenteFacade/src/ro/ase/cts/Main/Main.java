package ro.ase.cts.Main;

import ro.ase.cts.SalaEvenimente.Facade;

public class Main {
    public static void main(String[] args) {
        
        int nrMese = 55;
        
        System.out.println(Facade.verificaDisponibilitateSala(nrMese));
        
    }
    
}