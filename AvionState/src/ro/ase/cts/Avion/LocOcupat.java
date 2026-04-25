package ro.ase.cts.Avion;

public class LocOcupat implements Stare {

    public LocOcupat() {
        System.out.println("Stare activa: OCUPAT");
    }

    @Override
    public void doAction() {
        System.out.println("Locul este ocupat.");
    }
}
