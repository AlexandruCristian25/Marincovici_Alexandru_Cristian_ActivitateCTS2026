package ro.ase.cts.Jucator;

public class JucatorFactory {
    
    public static Jucator afiseazaJucator(TipJucator tipJucator, String nume, int nrMeciuri) {

        return switch(tipJucator) {

            case Portar -> new Portar(nume, nrMeciuri);
            case Atacant -> new Atacant(nume, nrMeciuri);
            case Mijlocas -> new Mijlocas(nume, nrMeciuri);
            default -> throw new IllegalArgumentException("Tip jucator inexistent: " + tipJucator);

        };

        
    }
    
}