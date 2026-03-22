package ro.ase.cts.Main;

import ro.ase.cts.Jucator.Jucator;
import ro.ase.cts.Jucator.JucatorFactory;
import ro.ase.cts.Jucator.TipJucator;

public class Main {
    public static void main(String[] args) {

        JucatorFactory jucatorFactory = new JucatorFactory();
        
        Jucator j1 = JucatorFactory.afiseazaJucator(TipJucator.Portar, "Alex ", 13);
        Jucator j2 = JucatorFactory.afiseazaJucator(TipJucator.Atacant, "Ionut ", 10);
        Jucator j3 = JucatorFactory.afiseazaJucator(TipJucator.Mijlocas, "Victor ", 17);
        
        j1.afiseazaInfo();
        j2.afiseazaInfo();
        j3.afiseazaInfo();
        
    }
}