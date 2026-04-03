package ro.ase.cts.Main;

import ro.ase.cts.Tara.ITara;
import ro.ase.cts.Tara.Tara;
import ro.ase.cts.Tara.AdapterTara;
import ro.ase.cts.Tara.TaraExterna;

public class Main {

    public static void afiseazaTara(ITara tara) {
        System.out.println("Informatii tara:");
        tara.afiseazaTara();
        System.out.println("Populatie:");
        tara.afiseazaPopulatie();
    }

    public static void main(String[] args) {

        ITara tara = new Tara("Romania", 19000000);
        afiseazaTara(tara);

        System.out.println("Se foloseste tara externa: ");

        TaraExterna taraExterna = new TaraExterna("Germania", 83000000);
        ITara adapter = new AdapterTara(taraExterna);

        afiseazaTara(adapter);
        
    }
    
}