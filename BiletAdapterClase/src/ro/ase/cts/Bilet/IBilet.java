package ro.ase.cts.Bilet;

public abstract class IBilet {
    
    public abstract void detalii();
    
    public void rezervaBilet() {
        System.out.println("Rezervare standard efectuata");
    }
}