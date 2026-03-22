package ro.ase.cts.Main;

import ro.ase.cts.Tren.TipTren;
import ro.ase.cts.Tren.Tren;
import ro.ase.cts.Tren.TrenFactory;

public class Main {
    public static void main(String[] args) {

        TrenFactory trenFactory = new TrenFactory();
        
        Tren t1 = TrenFactory.creeazaTren(TipTren.TrenElectric, "Marca1 ", 12);
        Tren t2 = TrenFactory.creeazaTren(TipTren.TrenCarbuni, "Marca2 ", 20);
        Tren t3 = TrenFactory.creeazaTren(TipTren.TrenMagnetic, "Marca3 ", 15);
        
        t1.afiseazaInfo();
        t2.afiseazaInfo();
        t3.afiseazaInfo();
        
    }
}