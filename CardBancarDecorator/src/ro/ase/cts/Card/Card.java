package ro.ase.cts.CardBancar;

public class Card implements ICard {
    
    private int nrCard;
    private String proprietar;
    
    public Card(int nrCard, String proprietar) {
        super();
        this.nrCard = nrCard;
        this.proprietar = proprietar;
    }
    
    @Override
    public void afiseazaDetalii() {
        System.out.println("Cardul cu numarul " + nrCard + " ii apartine lui " + proprietar);
    }
    
    public int getNrCard() {
        return nrCard;
    }
    
    public void setNrCard(int nrCard) {
        this.nrCard = nrCard;
    }
    
    public String getProprietar() {
        return proprietar;
    }
    
    public void setProprietar(String proprietar) {
        this.proprietar = proprietar;
    }

}