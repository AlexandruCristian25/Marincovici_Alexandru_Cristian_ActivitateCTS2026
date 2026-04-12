package ro.ase.cts.Main;

import ro.ase.cts.Nunta.Mireasa;
import ro.ase.cts.Nunta.PachetNunta;

public class Main {
    public static void main(String[] args) {
        
        Mireasa mireasa = new Mireasa("Mihaela", 29);
        PachetNunta pachetNunta = new PachetNunta(mireasa);
        pachetNunta.afiseazaInfo();
        
    }
    
}