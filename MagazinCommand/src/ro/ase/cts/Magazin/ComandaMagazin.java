package ro.ase.cts.Magazin;

public class ComandaMagazin implements Command {

    private Produs produs;

    public ComandaMagazin(Produs produs) {

        super();
        this.produs = produs;

    }

    @Override
    public void executa() {

        produs.vanzare();

    }

}