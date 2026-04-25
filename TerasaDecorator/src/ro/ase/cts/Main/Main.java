package ro.ase.cts.Main;

public class Main {
    public static void main(String[] args) {

        Chitanta chitanta = new Chitanta(124, 230.90);
        chitanta.printeazaChitanta();

        Decorator chitantaDecorata = new ChitantaDecorata(chitanta);
        chitantaDecorata.printeazaChitanta();
        
    }
    
}