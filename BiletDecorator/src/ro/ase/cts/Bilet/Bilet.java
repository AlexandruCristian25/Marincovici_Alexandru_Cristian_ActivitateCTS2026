package ro.ase.cts.Bilet;

public class Bilet implements IBilet {

    private String nume;
    private double pret;

    public Bilet(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public void afisareBilet() {
        System.out.println("Bilet pentru " + nume + " cu pretul de " + pret);
    }
    
}