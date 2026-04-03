package ro.ase.cts.Tara;

public class TaraExterna {

    private String denumire;
    private int nrLocuitori;

    public TaraExterna(String denumire, int nrLocuitori) {
        this.denumire = denumire;
        this.nrLocuitori = nrLocuitori;
    }

    public void showCountry() {
        System.out.println("Tara: " + denumire);
    }

    public void showPopulation() {
        System.out.println("Populatie: " + nrLocuitori);
    }
    
}