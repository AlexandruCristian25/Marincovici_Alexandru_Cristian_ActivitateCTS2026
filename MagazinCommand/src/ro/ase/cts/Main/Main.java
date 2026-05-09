package ro.ase.cts.Main;

public class Main {
    public static void main(String[] args) {
        
        package ro.ase.cts.Magazin;

public class Main {

    public static void main(String[] args) {

        Produs produs = new Produs() {

            @Override
            public void vanzare() {
                
                System.out.println("Produsul a fost vandut!");
                
            }
            
        };
        
        Command comanda = new ComandaMagazin(produs);
        
        Vanzator vanzator = new Vanzator();
        vanzator.invoca(comanda);
        
    }
    
}