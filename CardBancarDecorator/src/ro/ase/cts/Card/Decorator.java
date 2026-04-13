package ro.ase.cts.CardBancar;

public abstract class Decorator implements ICard {
    
    protected ICard card;
    
    public Decorator(ICard card) {
        this.card = card;
    }
    
    @Override
    public void afiseazaDetalii() {
        card.afiseazaDetalii();
        System.out.println("Plata ContactLess a functionat");
    }
    
}