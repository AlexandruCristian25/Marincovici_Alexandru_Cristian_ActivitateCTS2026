package ro.ase.cts.Main;

import ro.ase.cts.Tara.ITara;
import ro.ase.cts.Tara.Cazare;
import ro.ase.cts.Tara.Tara;

public class Main {
    public static void main(String[] args) {
        
        private static void afisareRezervare(ITara iTara) {
            
            System.out.println("Pentru client: ");
            iTara.afisareInfo();
            System.out.println("Pentru hotel: ");
            iTara.rezervaPachet();
            
        }
        
        ITara cazare = new Cazare();
        afisareRezervare(cazare);
        
        System.out.println("Se doreste cazarea camerei catre hotel");
        
        System.put.println("Cazare camera hotel");
        Tara tara = new Tara("Coreea de Sud", 20);
        System.out.println(tara.toString());
        
    }
}