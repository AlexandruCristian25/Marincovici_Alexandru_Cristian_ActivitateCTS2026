package ro.ase.cts.Main;

import ro.ase.cts.Barca.IBarca;
import ro.ase.cts.Barca.Rezervare;
import ro.ase.cts.Barca.BarcaFactory;

public class Main {
    public static void main(String[] args) {
        
        Rezervare rezervareIonescu = new Rezervare("Ionescu", 250.90);
        Rezervare rezervarePopescu = new Rezervare("Popescu", 450.90);
        Rezervare rezervareGeorgescu = new Rezervare("Georgescu", 500.90);
        
        BarcaFactory factory = new BarcaFactory();
        
        IBarca barca2 = factory.getBarca(1);
        barca2.tipareste(rezervareGeorgescu);
        factory.getBarca(1).tipareste(rezervarePopescu);
        factory.getBarca(2).tipareste(rezervareIonescu);
        
    }
    
}