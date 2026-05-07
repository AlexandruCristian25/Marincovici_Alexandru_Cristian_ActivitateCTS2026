package ro.ase.cts.Stadion;

public abstract class IntrareStadion {

    protected int nrLoc;

    public IntrareStadion(int nrLoc) {

        super();
        this.nrLoc = nrLoc;

    }

    public abstract void asezareCoada(int nrLoc);
    public abstract void prezentareBilet(int nrLoc);
    public abstract void controlCorporal(int nrLoc);
    public abstract void ocupareLoc(int nrLoc);

    public final void intrareStadion() {

        asezareCoada(nrLoc);
        prezentareBilet(nrLoc);
        controlCorporal(nrLoc);
        ocupareLoc(nrLoc);

    }

}