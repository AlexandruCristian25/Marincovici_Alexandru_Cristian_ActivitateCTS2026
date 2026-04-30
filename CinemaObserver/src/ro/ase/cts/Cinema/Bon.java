package ro.ase.cts.Cafenea;

public class Bon {

    private int nrBon;
    private double pret;

    public Bon(int nrBon, double pret) {
        this.nrBon = nrBon;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Bon [nrBon=" + nrBon + ", pret=" + pret + "]";
    }
    
}