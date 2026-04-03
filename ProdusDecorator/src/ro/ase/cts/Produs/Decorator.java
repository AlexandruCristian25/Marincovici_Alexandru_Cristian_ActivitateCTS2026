package ro.ase.cts.Produs;

public abstract class Decorator implements IProdus {
    
    protected Produs produs;
    
    public Decorator(Produs produs) {
        this.produs = produs;
    }
    
    @Override
    public void afiseazaInfo() {
        produs.afiseazaInfo();
        System.out.println("Produs achizitionat");
    }
    
    public abstract void aplicaDiscount(int procent);
    
}