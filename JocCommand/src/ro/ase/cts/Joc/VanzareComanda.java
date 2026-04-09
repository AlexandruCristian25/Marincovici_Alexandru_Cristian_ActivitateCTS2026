package ro.ase.cts.Joc;

public class VanzareComanda implements Command {
    
    private PachetJoc pachet;
    
    public VanzareComanda(PachetJoc pachet) {
        super();
        this.pachet = pachet;
    }
    
    @Override
    public void executa() {
        pachet.vanzare();
    }
    
}