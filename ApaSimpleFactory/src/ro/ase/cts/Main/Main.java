package ro.ase.cts.Main;

import ro.ase.cts.Apa.Apa;

public class Main {
    public static void main(String[] args) {
        
        ApaFactory factory = ApaFavtory.getInstance();
        
        Apa minerala = factory.getApa(TipApa.Minerala, 3.99);
        Apa plata = factory.getApa(TipApa.Plata, 2.99);
        Apa semiplata = factory.getApa(TipApa.Semiplata, 6.99);
        
        System.out.println(minerala.toString());
        System.out.println(plata.toString());
        System.out.println(semiplata.toString());
        
        ApaFactory factory2 = ApaFactory.getInstance();
        
    }
}