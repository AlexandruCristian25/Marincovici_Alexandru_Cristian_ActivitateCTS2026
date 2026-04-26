package ro.ase.cts.Main;

import ro.ase.cts.Cafenea.Cafenea;

public class Main {
    public static void main(String[] args) {
        
        Cafenea cafenea = new Cafenea("Locatie1");
        
        System.out.println(cafenea.toString());
        
        cafenea.adaugaMemento(cafenea.salvareMemento());
        cafenea.setNume("Cafenea2");
        
        System.out.println(cafenea.toString());
        
        cafenea.adaugaMemento(cafenea.salvareMemento());
        cafenea.setNume("Cafenea3");
        
        try {
            
            cafenea.undoToMemento(cafenea.getMemento(0));
            System.out.println(cafenea.toString());
            
        } catch(Exception e) {
            
            e.printStackTrace();
            
        }
        
    }
    
}