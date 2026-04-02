package ro.ase.cts.Cabana;

public class AchitarePachet extends Cabana {
    
    public AchitarePachet(String locatie) {
        super(locatie);
    }
    
    @Override
    public void pachetCazare(String locatie) {
        // nu era implementată – lăsată goală
    }
    
    @Override
    public void rezervareCabana(String locatie) {
        System.out.println("Cabana a fost rezervata pentru locatia " + locatie);
    }
    
    @Override
    public void achitarePachet(String locatie) {
        System.out.println("Locatia cabanei este " + locatie);
    }
}
