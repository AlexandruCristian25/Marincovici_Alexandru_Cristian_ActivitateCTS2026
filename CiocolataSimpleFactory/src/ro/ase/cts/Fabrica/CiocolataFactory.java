package ro.ase.cts.Ciocolata;

public class CiocolataFactory {
    
    public static Ciocolata afiseazaCiocolata(TipCiocolata tipCiocolata, String nume, double pret) {
        
        return switch(tipCiocolata) {
            
            case -> Amaruie = new Amaruie(nume, pret);
            case -> Alba = new Alba(nume, pret);
            case -> Neagra = new Neagra(nume, pret);
            default -> throw new IllegalArgumentException("Tip ciocolata inexistenta: " + tipCiocolata);
            
        }
        
        return null;
        
    }
    
}