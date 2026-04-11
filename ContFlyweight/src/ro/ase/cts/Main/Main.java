package ro.ase.cts.Main;

import ro.ase.cts.Cont.ContFactory;
import ro.ase.cts.Cont.ICont;
import ro.ase.cts.Cont.Banca;

public class Main {
    public static void main(String[] args) {
        
        Banca bancaMihnea = new Banca("BCR", 4836373);
        Banca bancaBianca = new Banca("BRD", 5373536);
        Banca bancaAlex = new Banca("Raiffeisen", 7383635);
        
        ContFactory factory = new ContFactory();
        
        ICont cont2 = factory.getCont("Mihnea");
        cont2.detalii(bancaAlex);
        factory.getCont("Mihnea").detalii(bancaMihnea);
        factory.getCont("Bianca").detalii(bancaBianca);
        
    }
    
}