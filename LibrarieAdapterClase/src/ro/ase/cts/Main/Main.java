package ro.ase.cts.Main;

public class Main {
    
    private void inchiriereCarte(ILibrarie librarie) {
        
        System.out.println("Pentru elev: ");
        linrarie.detalii();
        
    }
    
    public static void main(String[] args) {
        
        Librarie carte = new Carte();
        detalii(carte);
        
        Elev elev = new Elev("Ionescu", 12);
        System.out.println("Pentru elev: ");
        
        System.out.println("");
        
        System.out.println(carte.toString());
        
        System.out.println("Utilizare adapter: ");
        Elev elev2 = new Elev("Popescu", 15);
        
        Carte carte = nee Carte(elev2);
        
    }
    
}