package ro.ase.cts.Farmacist;

public class RetetaClient {
    
    private CardSanatate card;
    private String numeClient;
    private double pret;
    
    public RetetaClient(String numeClient, double pret, CardSanatate card) {
        this.numeClient = numeClient;
        this.pret = pret;
        this.card = card;
    }
    
    // FIX: tip de retur lipsă
    public CardSanatate getCard() {
        return card;
    }
    
    public void setCard(CardSanatate card) {
        this.card = card;
    }
    
    @Override
    public String toString() {
        return "RetetaClient [numeClient=" + numeClient + ", pret=" + pret + "]";
    }
    
}