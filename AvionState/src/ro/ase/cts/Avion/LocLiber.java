package ro.ase.cts.Avion;

public class LocLiber implements Stare {

    public LocLiber() {
        System.out.println("Stare activa: LIBER");
    }

    @Override
    public void doAction() {
        System.out.println("Locul este liber.");
    }
}
