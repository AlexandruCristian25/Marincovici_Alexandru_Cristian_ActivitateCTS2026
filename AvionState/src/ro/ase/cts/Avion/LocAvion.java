package ro.ase.cts.Avion;

public class LocAvion {

    private int nrLoc;
    private Stare stare;

    public LocAvion(int nrLoc) {
        super();
        this.nrLoc = nrLoc;
        this.stare = new LocLiber();
    }

    public void rezervareLoc() {
        if (this.stare instanceof LocLiber) {
            this.stare = new LocOcupat();
            System.out.println("Locul cu numarul " + nrLoc + " este rezervat");
        } else {
            System.out.println("Locul cu numarul " + nrLoc + " nu poate fi rezervat");
        }
    }

    public void ocupaLoc() {
        if (this.stare instanceof LocOcupat) {
            System.out.println("Locul cu numarul " + nrLoc + " este ocupat");
            this.stare.doAction();
        } else {
            System.out.println("Locul cu numarul " + nrLoc + " nu poate fi ocupat");
        }
    }
}
