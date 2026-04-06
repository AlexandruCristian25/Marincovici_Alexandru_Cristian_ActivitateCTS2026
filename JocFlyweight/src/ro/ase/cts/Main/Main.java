package ro.ase.cts.Main;

import ro.ase.cts.Joc.IJoc;
import ro.ase.cts.Joc.Achizitie;
import ro.ase.cts.Joc.JocFactory;

public class Main {
    public static void main(String[] args) {
        
        Achizitie achizitieIonescu = new Achizitie("Ionescu", "card");
        Achizitie achizitiePopescu = new Achizitie("Popescu", "cash");
        Achizitie achizitieAlex = new Achizitie("Alex", "transfer");
        
        JocFactory factory = new JocFactory();
        
        IJoc joc2 = factory.getJoc(45);
        joc2.info(achizitiePopescu);
        factory.getJoc(30).info(achizitieAlex);
        factory.getJoc(15).info(achizitieIonescu);
        
    }
    
}