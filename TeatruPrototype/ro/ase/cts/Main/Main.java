package ro.ase.cts.Main;

import ro.ase.cts.Teatru.Teatru;

public class Main {
    public static void main(String[] args) {

        Teatru teatru1 = new Teatru("Teatrul National");
        teatru1.adaugaSpectacol("Hamlet");
        teatru1.adaugaSpectacol("O scrisoare pierduta");

        Teatru teatru2 = (Teatru) teatru1.clone();
        teatru2.adaugaSpectacol("Romeo si Julieta");

        System.out.println(teatru1);
        System.out.println(teatru2);
        
    }
    
}
