package ro.ase.cts.Main;

import ro.ase.cts.Ceas.Ceas;

public class Main {
    public static void main(String[] args) {
        
        CeasFactory factory = CeasFactory.getInstance();
        
        Ceas mecanic = factory.getCeas(TipCeas.Mecanic, 30);
        Ceas automat = factory.getCeas(TipCeas.Automat, 15);
        Ceas digital = factory.getCeas(TipCeas.Digital, 50);
        
        System.out.println(mecanic.toString());
        System.out.println(automat.toString());
        System.out.println(digital.toString());
        
        CeasFactory factory2 = CeasFactory.getInstance();
        
    }
}