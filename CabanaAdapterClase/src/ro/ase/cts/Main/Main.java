package ro.ase.cts.Main;

import ro.ase.cts.Cabana.CazareCabana;
import ro.ase.cts.Cabana.ICabana;
import ro.ase.cts.Cabana.Masina;
import ro.ase.cts.Cabana.MasinaInchiriata;

public class Main {

    public static void printeazaRezervare(ICabana iCabana) {
        System.out.println("Pentru client: ");
        iCabana.info();
        System.out.println("Pentru sofer: ");
        iCabana.rezervaCabana();
    }

    public static void main(String[] args) {
        
        ICabana cazareCabana = new CazareCabana();
        printeazaRezervare(cazareCabana);
        
        System.out.println("Se doreste inchirierea unei masini");
        
        System.out.println("Masina inchiriata");
        Masina masina = new Masina("Audi", "Popescu");
        MasinaInchiriata masinaInchiriata = new MasinaInchiriata(masina);
        
        System.out.println(masina.toString());
        
        printeazaRezervare(masinaInchiriata);
        
    }
}