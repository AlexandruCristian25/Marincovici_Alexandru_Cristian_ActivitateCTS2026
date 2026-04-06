package ro.ase.cts.Bon;

public class BonDecorat extends Decorator {
    
    public BonDecorat(Bon bon) {
        super(bon);
    }
    
    @Override
    public void discount(int procent) {
        bon.setSuma(bon.getSuma() * (100 - procent) / 100.0);
    }
    
}