package ro.ase.cts.Main;

import ro.ase.cts.Jucator.Jucator;

public class Main {
    public static void main(String[] args) {
        
        Jucator j1 = JucatorFactory(tipJucator.Portar, "Alex", 13);
        Jucator j2 = JucatorFactory(tipJucator.Atacant, "Ionut", 10);
        Jucator j3 = JucatorFactory(tipJucator.Mijlocas, "Voctor", 17);
        
        j1.afiseazaInfo();
        j2.afiseazaInfo();
        j3.afiseazaInfo();
        
    }
}