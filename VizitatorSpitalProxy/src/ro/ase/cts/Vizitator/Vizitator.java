package ro.ase.cts.Vizitator;

public class Vizitator implements ISpital {

    private SalaAsteptare salaAsteptare;

    public Vizitator(SalaAsteptare salaAsteptare) {
        this.salaAsteptare = salaAsteptare;
    }

    public SalaAsteptare getSalaAsteptare() {
        return salaAsteptare;
    }

    public void setSalaAsteptare(SalaAsteptare salaAsteptare) {
        this.salaAsteptare = salaAsteptare;
    }

    @Override
    public void echipareVizitator() {
        System.out.println("Vizitatorii sunt echipati.");
    }
}
