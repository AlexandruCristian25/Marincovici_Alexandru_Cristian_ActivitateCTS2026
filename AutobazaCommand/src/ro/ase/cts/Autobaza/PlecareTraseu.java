package ro.ase.cts.Autobaza;

public class PlecareTraseu implements IComandaPlecare {
    
    private IComandaPlecare plecare;
    
    public PlecareTraseu(IComandaPlecare plecare) {
        super();
        this.plecare = plecare;
    }
    
    @Override
    public void executa() {
        plecare.executa();
    }
    
}