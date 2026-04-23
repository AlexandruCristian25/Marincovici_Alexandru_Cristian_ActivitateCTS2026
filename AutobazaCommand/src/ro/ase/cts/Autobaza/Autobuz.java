package ro.ase.cts.Autobaza;

public class Autobuz implements IComandaPlecare {
    
    private int nrLinie;
    
    public Autobuz(int nrLinie) {
        super();
        this.nrLinie = nrLinie;
    }
    
    @Override
    public void executa() {
        System.out.println("Autobuzul cu linia " + nrLinie + " a plecat din autobaza");
    }
    
}