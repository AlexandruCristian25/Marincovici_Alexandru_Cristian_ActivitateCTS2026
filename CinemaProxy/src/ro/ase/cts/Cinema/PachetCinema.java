package ro.ase.cts.Cinema;

public class PachetCinema implements ICinema {

    private Persoana persoana;

    public Persoana getPersoana() {
        return persoana;
    }

    public void setPersoana(Persoana persoana) {
        this.persoana = persoana;
    }

    @Override
    public void detalii() {
        System.out.println("Pachetul este existent");
    }
    
}
