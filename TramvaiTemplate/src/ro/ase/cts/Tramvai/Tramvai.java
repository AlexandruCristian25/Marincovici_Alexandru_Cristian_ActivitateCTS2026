package ro.ase.cts.Tramvai;

public abstract class Tramvai {

    protected String numeStatie;

    public Tramvai(String numeStatie) {
        this.numeStatie = numeStatie;
    }

    public abstract void nrLinie(String numeStatie);
    public abstract void cautareStatie(String numeStatie);
    public abstract void platesteBilet(String numeStatie);

    public final void vindeBilet() {
        nrLinie(numeStatie);
        cautareStatie(numeStatie);
        platesteBilet(numeStatie);
    }
    
}
