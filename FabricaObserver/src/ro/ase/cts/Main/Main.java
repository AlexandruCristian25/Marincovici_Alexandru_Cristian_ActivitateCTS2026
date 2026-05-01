package ro.ase.cts.Main;

import ro.ase.cts.Fabrica.Fabrica;
import ro.ase.cts.Fabrica.Muncitor;

public class Main {
    public static void main(String[] args) {
        
        Muncitor muncitor1 = new Muncitor("Ionescu");
        Muncitor muncitor2 = new Muncitor("Popescu");
        Muncitor muncitor3 = new Muncitor("Vasilescu");
        
        Fabrica fabrica = new Fabrica("Fabrica1");
        
        fabrica.adaugaObserver(muncitor3);
        fabrica.adaugaObserver(muncitor2);
        fabrica.trimiteEmail();
        fabrica.adaugaObserver(muncitor1);
        
    }
    
}