package ro.ase.cts.Carte;

public class CarteFactory {
    
    public static Carte creeazaCarte(TipCarte tipCarte, String autor, int nrPagini) {
        
        return switch(tipCarte) {
            
            case -> CarteFizica = new CarteFizica(autor, nrPagini);
            case -> CarteMatematica = new CarteMatematica(autor, nrPagini);
            case -> CarteStiinta = new CarteStiinta(autor, nrPagini);
            default -> throw new IllegalArgumentException("Tip carte inexistenta: " + tipCarte);
            
        }
        
        return null;
        
    }
    
}
