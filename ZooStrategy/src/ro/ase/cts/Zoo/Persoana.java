package ro.ase.cts.Zoo;

public class Persoana {
    
    private String nume;
    private TipBilet tipBilet;
    
    public void rezervare(String zi) {
        
        tipBilet.rezervare(this.nume, zi);
        
    }
    
    public Persoana(String nume, TipBilet tipBilet) {
        
        super();
        this.nume = nume;
        this.tipBilet = tipBilet;
        
    }
    
    public Persoana(String nume) {
        
        super();
        this.nume = nume;
        this.tipBilet = new BiletFizic();
        
    }
    
    public String getNume() {
        
        return nume;
        
    }
    
    public void setNume(String nume) {
        
        this.nume = nume;
        
    }
    
    public TipBilet getTipBilet() {
        
        return tipBilet;
        
    }
    
    public void setTipBilet(TipBilet tipBilet) {
        
        this.tipBilet = tipBilet;
        
    }
    
}