package ro.ase.cts.Cinema;

public class Loc {

    private int nrLoc;
    private State state;

    public Loc(int nrLoc) {
        super();
        this.nrLoc = nrLoc;
        state = new Liber();
    }

    public void rezervaLoc() {

        if (this.state instanceof Liber) {

            System.out.println("Locul nr " + nrLoc + " este rezervat");
            state = new Rezervat();

        } else {

            System.out.println("Locul nr " + nrLoc + " nu poate fi rezervat");

        }

    }

    public void ocupaLoc() {

        if (this.state instanceof Rezervat) {

            System.out.println("Locul nr " + nrLoc + " este ocupat");
            state = new Ocupat();

        } else {

            System.out.println("Locul nr " + nrLoc + " nu poate fi ocupat");

        }

    }

    public void elibereazaLoc() {

        if (!(this.state instanceof Liber)) {

            System.out.println("Locul nr " + nrLoc + " este eliberat");
            state = new Liber();

        } else {

            System.out.println("Locul nr " + nrLoc + " este deja liber");

        }

    }
    
}