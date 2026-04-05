package ro.ase.cts.Comanda;

public class ComandaDecorator extends Decorator {
    
    public ComandaDecorator(Comanda comanda) {
        
        super(comanda);
        
    }
    
    @Override
    public void discount(int procent) {
        
        super.comanda.setPret(super.comanda.getPret() * (100 - procent) / 100);
        
    }
    
}