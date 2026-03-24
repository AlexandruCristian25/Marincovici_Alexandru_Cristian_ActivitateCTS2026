package ro.ase.cts.Loc;

import ro.ase.cts.Loc.Loc;

public class LocDecorat extends Decorator {
    
    public LocDecorator(Loc loc) {
        
        super(loc);
        
    }
    
    @Override
    public void aplicaDiscount(int procent) {
        
        super.loc.setRand(super.loc.getRand() * (100 - procent) / 100);
        
    }
    
}