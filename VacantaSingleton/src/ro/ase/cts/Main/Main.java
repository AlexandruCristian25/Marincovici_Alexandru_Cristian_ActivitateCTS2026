package ro.ase.cts.Main;

import ro.ase.cts.Vacanta.Vacanta;

public class Main {
    public static void main(String[] args) {
        
        Vacanta v1 = Vacanta.getInstance();
        Vacanta v2 = Vacanta.getInstance();
        
        v2.setOras("Oras: Seoul");
        v2.setPret("Pret: 8900.90 lei");
        v2.setNrPersoane("NrPersoane: 5");
        
        System.out.println(v2.getOras());
        System.out.println(v2.getPret());
        System.out.println(v2.getNrPersoane());
        
    }
}