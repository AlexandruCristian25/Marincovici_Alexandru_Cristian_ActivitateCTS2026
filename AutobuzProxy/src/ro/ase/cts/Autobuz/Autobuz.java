package ro.ase.cts.Autobuz;

public class Autobuz implements IAutobuz {

    private Sofer sofer;

    public Autobuz(Sofer sofer) {
        this.sofer = sofer;
    }

    public Sofer getSofer() {
        return sofer;
    }

    public void setSofer(Sofer sofer) {
        this.sofer = sofer;
    }

    @Override
    public void afiseazaInfo() {
        System.out.println("Soferul " + sofer.getNume() +
                ", este pe autobuzul de pe linia 1 iar programul autobuzului este " +
                sofer.getProgram());
    }
}
