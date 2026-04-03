package ro.ase.cts.Cabana;

public class CazareCabana implements ICabana {
    
    @Override
    public void info() {
        System.out.println("Cabana rezervata");
    }
    
    @Override
    public void rezervaCabana() {
        System.out.println("Trimitere cerere de rezervare");
    }
    
}