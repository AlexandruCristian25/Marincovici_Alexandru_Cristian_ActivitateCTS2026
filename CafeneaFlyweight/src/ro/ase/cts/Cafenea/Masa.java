package ro.ase.cts.Cafenea;

public class Masa implements IMasa {

    private int nrMasa;
    private int nrLocuri;

    public Masa(int nrMasa, int nrLocuri) {
        this.nrMasa = nrMasa;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void tipareste(Bon bon) {
        System.out.println(this.toString() + " " + bon.toString());
    }

    @Override
    public String toString() {
        return "Masa [nrMasa=" + nrMasa + ", nrLocuri=" + nrLocuri + "]";
    }
    
}