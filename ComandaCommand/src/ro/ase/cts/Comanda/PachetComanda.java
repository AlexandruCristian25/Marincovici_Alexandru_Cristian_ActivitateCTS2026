package ro.ase.cts.Comanda;

public class PachetComanda {

    private int cod;

    public PachetComanda(int cod) {
        this.cod = cod;
    }

    public void rezervare() {
        System.out.println("Pachetul cu codul " + cod + " a fost rezervat.");
    }

    public void vanzare() {
        System.out.println("Pachetul cu codul " + cod + " a fost vandut.");
    }
    
}