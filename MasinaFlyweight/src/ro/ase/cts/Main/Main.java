package ro.ase.cts.Main;

import ro.ase.cts.Masina.MasinaFactory;
import ro.ase.cts.Masina.IMasina;
import ro.ase.cts.Masina.Rezervare;

public class Main {
    public static void main(String[] args) {
        
        Rezervare rezervareVasile = new Rezervare("Vasile", 3700);
        Rezervare rezervareAndrei = new Rezervare("Andrei", 4200);
        Rezervare rezervareMihai = new Rezervare("Mihai", 4000);
        
        MasinaFactory factory = new MasinaFactory();
        
        IMasina masina2 = factory.getMasina(3200);
        masina2.afiseazaInfo(rezervareVasile);
        factory.getMasina(3900).afiseazaInfo(rezervareAndrei);
        factory.getMasina(3500).afiseazaInfo(rezervareMihai);
        
    }
    
}