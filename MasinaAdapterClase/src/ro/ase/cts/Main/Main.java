package ro.ase.cts.Main;

import ro.ase.cts.Masina.IMasina;
import ro.ase.cts.Masina.Inchiriere;
import ro.ase.cts.Masina.Masina;
import ro.ase.cts.Masina.MasinaInchiriata;

public class Main {
    
    public static void afisareRezervare(IMasina iMasina) {
        System.out.println("Pentru client: ");
        iMasina.info();
        System.out.println("Pentru firma: ");
        iMasina.pachetMasina();
    }
    
    public static void main(String[] args) {
        
        IMasina inchiriere = new Inchiriere();
        afisareRezervare(inchiriere);
        
        System.out.println("S-a gasit o masina clasica pentru inchiriere");
        
        System.out.println("Detalii masina: ");
        Masina masina = new Masina("Viper", 2);
        
       
        IMasina masinaInchiriata = new MasinaInchiriata(masina);
        afisareRezervare(masinaInchiriata);
        
    }
    
}