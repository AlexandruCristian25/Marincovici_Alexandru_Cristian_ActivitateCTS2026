package ro.ase.cts.Loc;

public class Loc {

    private int nrLoc;
    private State stare;

    public Loc(int nrLoc) {
        this.nrLoc = nrLoc;
        this.stare = new Liber();
    }

    public void setStare(State stare) {
        this.stare = stare;
    }

    public void rezervareLoc() {
        stare.rezervareLoc(this);
    }

    public void ocupaLoc() {
        stare.ocupaLoc(this);
    }

    public void eliberareLoc() {
        stare.eliberareLoc(this);
    }
    
}