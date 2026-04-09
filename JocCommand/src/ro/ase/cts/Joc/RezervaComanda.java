package ro.ase.cts.Joc;

public class RezervaComanda implements Command {
    
    private PachetJoc pachet;
    
    public RezervaComanda(PachetJoc pachet) {
        super();
        this.pachet = pachet;
    }
    
    @Override
    public void executa() {
        pachet.rezerva();
    }
    
}