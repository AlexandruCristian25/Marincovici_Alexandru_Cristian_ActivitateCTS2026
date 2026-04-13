package ro.ase.cts.Bilet;

public class RezervareBilet extends IBilet {
    
    @Override
    public void detalii() {
        System.out.println("Detalii bilet: rezervare standard");
    }
    
    @Override
    public void rezervaBilet() {
        System.out.println("Rezervare bilet efectuata cu succes");
    }
    
}