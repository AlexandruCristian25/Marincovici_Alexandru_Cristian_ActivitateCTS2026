package ro.ase.cts.Tara;

public class Tara implements ITara {

    private String nume;
    private int populatie;

    public Tara(String nume, int populatie) {
        this.nume = nume;
        this.populatie = populatie;
    }

    @Override
    public void afiseazaTara() {
        System.out.println("Tara: " + nume);
    }

    @Override
    public void afiseazaPopulatie() {
        System.out.println("Populatie: " + populatie);
    }
    
}