package ro.ase.cts.Mancare;

public class Magazin implements IMagazin {
    
    private String numeMagazin;
    private int nrAngajati;
    private int suprafata;
    
    public Magazin(String numeMagazin, int nrAngajati, int suprafata) {
        
        super();
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
        
        return "Magazin [ numeMagazin = " + numeMagazin + ", nrAngajati = " + nrAngajati + ", suprafata" + suprafata + "]";
        
    }
    
}