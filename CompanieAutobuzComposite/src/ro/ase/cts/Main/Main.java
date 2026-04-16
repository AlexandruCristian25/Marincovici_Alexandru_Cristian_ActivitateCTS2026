package ro.ase.cts.Main;

import ro.ase.cts.Autobuz.Optiune;
import ro.ase.cts.Autobuz.Autobuz;
import ro.ase.cts.Autobuz.Grup;

public class Main {
    public static void main(String[] args) {
        
        Optiune aMarca = new Autobuz("Marca");
        Optiune aTipAutobuz = new Autobuz("Tip Autobuz");
        Optiune aNrLocuri = new Autobuz("Nr locuri");
        
        Optiune gGrup1 = new Grup("Grup de 10");
        Optiune gGrup2 = new Grup("Grup de 30");
        Optiune gGrup3 = new Grup("Grup de 50");
        Optiune gEditare = new Grup("Editare grup");
        
        try {
            
            aMarca.adaugaNod(gGrup1);
            aMarca.adaugaNod(gGrup2);
            aMarca.adaugaNod(gGrup3);
            
            aTipAutobuz.adaugaNod(gGrup1);
            aTipAutobuz.adaugaNod(gGrup2);
            aTipAutobuz.adaugaNod(gGrup3);
            
            aTipAutobuz.stergeNod(gGrup2);
            aTipAutobuz.afisareInfo();
            
        } catch(Exception e) {
            
            e.printStackTrace();
            
        }
        
    }
    
}