package ro.ase.cts.Farmacist;

public class Facade {
    
    private Farmacist farmacist;
    private CardSanatate card;
    
    public Facade() {
        this.farmacist = new Farmacist("Popescu");
        this.card = new CardSanatate("Ionescu");
    }
    
    public void verificaReteta(String medicament) {
        
        farmacist.verificaReteta(medicament);
        
        RetetaClient reteta = card.emiteReteta("Ionescu", 100);
        System.out.println(reteta.toString());
        
    }
    
}