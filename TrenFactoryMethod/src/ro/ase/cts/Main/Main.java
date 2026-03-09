package ro.ase.cts.Main;

import ro.ase.cts.Tren.Tren;

public class Main {
    public static void main(String[] args) {
        
        Tren t1 = TrenFactory.creeazaTren(tipTren.TrenElectric, "Marca1", 12);
        Tren t2 = TrenFactory.creeazaTren(tipTren.TrenCarbuni, "Marca2", 20);
        Tren t3 = TrenFactory.creeazaTren(tipTren.TrenMagnetuc, "Marca3", 15);
        
        t1.afiseazaInfo();
        t2.afiseazaInfo();
        t3.afiseazaInfo();
        
    }
}