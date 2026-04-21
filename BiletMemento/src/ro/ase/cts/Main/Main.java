package ro.ase.cts.Main;

import ro.ase.cts.Bilet.Bilet;

public class Main {
    public static void main(String[] args) {
        
        Bilet bilet = new Bilet(89);
        
        System.out.println(bilet.toString());
        bilet.adaugaMemento(bilet.salvareMemento());
        bilet.setPret(66.90);
        
        Bilet bilet2 = new Bilet(12);
        
        System.out.println(bilet2.toString());
        bilet2.adaugaMemento(bilet2.salvareMemento());
        bilet2.setPret(95.90);
        
        try {
            
            bilet.undoToMemento(bilet.getMemento(0));
            System.out.println(bilet.toString());
            
        } catch(Exception e) {
            
            e.printStackTrace();
        }
        
    }
    
}