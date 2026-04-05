package ro.ase.cts.Comanda;

public class RezervareComanda implements Command {

    private PachetComanda pachet;

    public RezervareComanda(PachetComanda pachet) {
        this.pachet = pachet;
    }

    @Override
    public void executa() {
        pachet.rezervare();
    }
    
}