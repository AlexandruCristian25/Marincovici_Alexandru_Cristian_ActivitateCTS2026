package ro.ase.cts.Jucator;

public class JucatorFactory {
    
    public static Jucator afiseazaJucator(TipJucator tipJucator, String nume, int nrMeciuri) {
        
        case Portar:
            return Portar(nume, nrMeciuri);
        case Atacant:
            return Atacant(nume, nrMeciuri);
        case Mijlocas:
            return Mijlocas(nume, nrMeciuri);
        default:
            throw IllegalArgumentException("Tip jucator inexistent: " + tipJucator);
        
    }
    
}