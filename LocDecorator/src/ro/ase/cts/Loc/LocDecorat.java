package ro.ase.cts.Loc;

public class LocDecorat extends Decorator {
    
    public LocDecorat(Loc loc) {
        super(loc);
    }
    
    @Override
    public void aplicaDiscount(int procent) {
        super.loc.setRand(super.loc.getRand() * (100 - procent) / 100);
    }
    
}