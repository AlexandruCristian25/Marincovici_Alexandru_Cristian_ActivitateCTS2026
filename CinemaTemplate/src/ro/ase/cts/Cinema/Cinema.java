package ro.ase.cts.Cinema;

public abstract class Cinema {

    protected String nume;

    public Cinema(String nume) {
        super();
        this.nume = nume;
    }

    public abstract void cautareFilm(String nume);
    public abstract void cautareSala(String nume);
    public abstract void cautareLoc(String nume);

    public final void vindeBilet() {
        cautareFilm(this.nume);
        cautareSala(this.nume);
        cautareLoc(this.nume);
    }
}
