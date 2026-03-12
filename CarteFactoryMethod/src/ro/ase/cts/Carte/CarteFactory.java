package ro.ase.cts.Carte;

public class CarteFactory {
    
    public static Carte creeazaCarte(TipCarte tipCarte, String autor, int nrPagini) {
        
        switch(tipCarte) {
            
            case CarteStiinta:
                return CarteStiinta(autor, nrPagini);
            case CarteFizica:
                return CarteFizica(autor, nrPagini);
            case CarteMatematica:
                return CarteMatematica(autor, nrPagini);
            default:
                throw IllegalArgumentException("Tip carte inexistenta: " + tipCarte);
            
        }
        
    }
    
}