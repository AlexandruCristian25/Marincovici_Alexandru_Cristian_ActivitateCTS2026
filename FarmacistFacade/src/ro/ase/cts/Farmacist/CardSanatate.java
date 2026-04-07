package ro.ase.cts.Farmacist;

public class CardSanatate {
    
    private String numeCardSanatate;
    
    public CardSanatate(String nume) {
        this.numeCardSanatate = nume;
    }
    
    @Override
    public String toString() {
        return "CardSanatate [numeCardSanatate=" + numeCardSanatate + "]";
    }
    
    public RetetaClient emiteReteta(String numeClient, double pret) {
        return new RetetaClient(numeClient, pret, this);
    }
    
}