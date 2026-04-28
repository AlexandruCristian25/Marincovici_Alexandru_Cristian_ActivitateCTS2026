package ro.ase.cts.Vacanta;

public class Client {

    private String nume;
    private TipPlata tipPlata;

    public Client(String nume, TipPlata tipPlata) {

        super();
        this.nume = nume;
        this.tipPlata = tipPlata;

    }

    public Client(String nume) {

        super();
        this.nume = nume;
        this.tipPlata = new PlataCard();

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

        tipPlata.plateste(this.nume, suma);

    }

}