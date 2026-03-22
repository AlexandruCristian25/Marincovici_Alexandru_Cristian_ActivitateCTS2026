package ro.ase.cts.Main;

import ro.ase.cts.Autor.Autor;

public class Main {
    public static void main(String[] args) {
        
        Autor a1 = Autor.getInstance();
        Autor a2 = Autor.getInstance();
        
        a2.setNume("Nume: Eminescu");
        
        System.out.println(a2.getNume());
        
    }
}