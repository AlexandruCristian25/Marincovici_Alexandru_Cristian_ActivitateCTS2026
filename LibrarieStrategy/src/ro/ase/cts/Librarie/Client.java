package ro.ase.cts.Librarie;

public class Client {

    private String nume;
    private TipPlata tipPlata;

    public Client(String nume, TipPlata tipPlata) {

        this.nume = nume;
        this.tipPlata = tipPlata;

    }

    public Client(String nume) {

        this.nume = nume;
        this.tipPlata = new Cash();

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public TipPlata getTipPlata() {
        return tipPlata;
    }

    public void setTipPlata(TipPlata tipPlata) {
        this.tipPlata = tipPlata;
    }
    
    public void plateste(double suma) {
        if (tipPlata != null) {
            
            tipPlata.plateste(nume, suma);
            
        } else {
            
            System.out.println("Nu exista metoda de plata setata!");
            
        }
        
    }
    
}