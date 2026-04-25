package ro.ase.cts.Main;

import ro.ase.cts.Autobuz.ManagerIstoric;
import ro.ase.cts.Autobuz.Autobuz;

public class Main {
    public static void main(String[] args) {
        
        Autobuz autobuz = new Autobuz("MAN");
        ManagerIstoric managerIstoric = new ManagerIstoric();
        
        System.out.println(autobuz.toString());
        managerIstoric.adaugaMemento(autobuz.salvareMemento());
        autobuz.setMarca("Mercedes");
        
        System.out.println(autobuz.toString());
        managerIstoric.adaugaMemento(autobuz.salvareMemento());
        autobuz.setMarca("Volvo");
        
        try {
            
            autobuz.undoToMemento(managerIstoric.getMemento(0));
            System.out.println(autobuz.toString());
            
        } catch(Exception e) {
            
        }
        
    }
    
}