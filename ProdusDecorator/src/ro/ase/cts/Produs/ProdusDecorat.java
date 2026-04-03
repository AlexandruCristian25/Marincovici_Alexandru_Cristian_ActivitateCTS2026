package ro.ase.cts.Produs;

public class ProdusDecorat extends Decorator {
    
    public ProdusDecorat(Produs produs) {
        super(produs);
    }
    
    @Override
    public void aplicaDiscount(int procent) {
        super.produs.setPret(super.produs.getPret() * (100 - procent) / 100);
    }
    
}