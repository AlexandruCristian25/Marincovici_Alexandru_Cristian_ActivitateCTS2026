package ro.ase.cts.Main;

import ro.ase.cts.Aeroport.Client;
import ro.ase.cts.Aeroport.Aeroport;

public class Main {
    public static void main(String[] args) {
        
        Aeroport aeroport = new Aeroport("Mihnea", 1250.90);
        Client client = new Client();
        
        System.out.println(aeroport.toString());
        client.adaugaMemento(aeroport.salvareMemento());
        
        aeroport.setPretBilet(1450.90);
        System.out.println(aeroport.toString());
        client.adaugaMemento(aeroport.salvareMemento());
        
        aeroport.setPretBilet(1300.90);
        System.out.println(aeroport.toString());
        client.adaugaMemento(aeroport.salvareMemento());
        
        aeroport.setPretBilet(850.90);
        System.out.println(aeroport.toString());
        
        try {
            
            aeroport.undoToMemento(client.getMemento(0));
            System.out.println(aeroport.toString());
            
        } catch(Exception exception) {
            
        }
        
    }
    
}