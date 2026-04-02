package ro.ase.cts.Loc;

public abstract class Decorator implements ILoc {
    
    protected Loc loc;
    
    public Decorator(Loc loc) {
        this.loc = loc;
    }
    
    @Override
    public void afiseazaInfo() {
        loc.afiseazaInfo();
        System.out.println("Loc rezervat");
    }
    
    public abstract void aplicaDiscount(int procent);
    
}