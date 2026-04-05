package ro.ase.cts.Comanda;

public abstract class Decorator implements IComanda {
    
    protected Comanda comanda;
    
    public Decorator(Comanda comanda) {
        this.comanda = comanda;
    }
    
    @Override
    public void afiseazaComanda() {
        
        comanda.afiseazaComanda();
        System.out.println("Comanda plasata");
    }
    
    public abstract void discount(int procent);
    
}