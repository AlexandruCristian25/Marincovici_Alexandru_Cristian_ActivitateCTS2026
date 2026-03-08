package ro.ase.cts.Main;

import ro.ase.cts.Biblioteca.Biblioteca;

public class Main {
    
    public static void main(String[] args) {
        
        Biblioteca b1 = Biblioteca.getInstance();
        Biblioteca b2 = Biblioteca.getInstance();
        
        b2.setNrCarti(120);
        System.out.println(b2.getNrCarti());
        
    }
    
}