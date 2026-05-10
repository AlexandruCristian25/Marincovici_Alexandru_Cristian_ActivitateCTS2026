package ro.ase.cts.Autobuz;

public class AutobuzProxy implements IAutobuz {

    private Autobuz autobuz;

    public AutobuzProxy(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    public AutobuzProxy(Sofer sofer) {
        this.autobuz = new Autobuz(sofer);
    }

    @Override
    public void afiseazaInfo() {
        autobuz.afiseazaInfo();
    }
}
