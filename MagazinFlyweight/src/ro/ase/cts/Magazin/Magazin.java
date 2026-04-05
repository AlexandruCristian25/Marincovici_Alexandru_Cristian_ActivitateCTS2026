package ro.ase.cts.Magazin;

public class Magazin implements IMagazin {
    
    private String numeMagazin;
    private int nrAngajati;
    private int suprafata;
    
    public Magazin(String numeMagazin, int nrAngajati, int suprafata) {
        this.numeMagazin = numeMagazin;
        this.nrAngajati = nrAngajati;
        this.suprafata = suprafata;
    }
    
    @Override
    public void vanzare(Produs produs) {
        System.out.println(this.toString() + " " + produs.toString());
    }
    
    @Override
    public String toString() {
        return "Magazin [numeMagazin=" + numeMagazin +
                ", nrAngajati=" + nrAngajati +
                ", suprafata=" + suprafata + "]";
    }
}