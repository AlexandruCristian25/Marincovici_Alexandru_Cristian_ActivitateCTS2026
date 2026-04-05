package ro.ase.cts.Main;

import ro.ase.cts.Aplicatie.Aplicatie;
import ro.ase.cts.Aplicatie.Utilizator;

public class Main {
    public static void main(String[] args) {
        
        Utilizator utilizator = new Utilizator("Mesaj1");
        Aplicatie aplicatie = new Aplicatie();
        
        System.out.println(utilizator.toString());
        aplicatie.adaugaMemento(utilizator.salvareMemento());
        
        utilizator.setMesaj("Mesaj4"); 
        System.out.println(utilizator.toString());
        
        utilizator.setMesaj("Mesaj7");
        System.out.println(utilizator.toString());
        
        aplicatie.adaugaMemento(utilizator.salvareMemento());
        
        utilizator.setMesaj("Mesaj10");
        
        try {
            
            utilizator.undoToMemento(aplicatie.getMemento(0));
            System.out.println(utilizator.toString());
            
        } catch(Exception e) {
            
            e.printStackTrace();
            
        }
        
    }
    
}