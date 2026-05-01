package ro.ase.cts.Electronice;

public class Utilizator {
    
    private String nume;
    private TipElectronice tipElectronice;
    
    public Utilizator(String nume, TipElectronice tipElectronice) {
        this.nume = nume;
        this.tipElectronice = tipElectronice;
    }
    
    public Utilizator(String nume) {
        this.nume = nume;
        this.tipElectronice = new Laptop();
    }
    
    public String getNume() {
        return nume;
    }
    
    public void setNume(String nume) {
        this.nume = nume;
    }
    
    public TipElectronice getTipElectronice() {
        return tipElectronice;
    }
    
    public void setTipElectronice(TipElectronice tipElectronice) {
        this.tipElectronice = tipElectronice;
    }
    
    public void utilizare(int ram) {
        tipElectronice.utilizare(this.nume, ram);
    }
    
}