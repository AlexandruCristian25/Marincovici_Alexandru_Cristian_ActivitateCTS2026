package ro.ase.cts.Vizitator;

public class SalaAsteptare {

    private String numeVizitator;
    private int nrVizitatori;

    public SalaAsteptare(String numeVizitator, int nrVizitatori) {
        this.numeVizitator = numeVizitator;
        this.nrVizitatori = nrVizitatori;
    }

    public String getNumeVizitator() {
        return numeVizitator;
    }

    public void setNumeVizitator(String numeVizitator) {
        this.numeVizitator = numeVizitator;
    }

    public int getNrVizitatori() {
        return nrVizitatori;
    }

    public void setNrVizitatori(int nrVizitatori) {
        this.nrVizitatori = nrVizitatori;
    }

    @Override
    public String toString() {
        return "SalaAsteptare[numeVizitator=" + numeVizitator +
                ", nrVizitatori=" + nrVizitatori + "]";
    }
}
