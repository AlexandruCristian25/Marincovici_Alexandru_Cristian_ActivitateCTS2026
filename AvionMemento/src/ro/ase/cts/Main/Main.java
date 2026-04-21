package ro.ase.cts.Main;

import ro.ase.cts.Avion.Avion;
import ro.ase.cts.Avion.Operator;

public class Main {
    public static void main(String[] args) {
        
        Avion avion = new Avion(2500.90, 180);
        Operator operator = new Operator();
        
        System.out.println(avion.toString());
        operator.adaugaMemento(avion.salvareMemento());
        
        avion.setPretBilet(3400.90);
        
        System.out.println(avion.toString());
        operator.adaugaMemento(avion.salvareMemento());
        
        avion.setPretBilet(1670.90);
        
        try {
            
            avion.undoToMemento(operator.getMemento(0));
            System.out.println(avion.toString());
            
        } catch(Exception e) {
            
            e.printStackTrace();
            
        }
        
    }
    
}