package ro.ase.cts.Comanda;

public class VanzareComanda implements Command {

    private PachetComanda pachet;

    public VanzareComanda(PachetComanda pachet) {
        this.pachet = pachet;
    }

    @Override
    public void executa() {
        pachet.vanzare();
    }
    
}