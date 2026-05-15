package ro.ase.cts.Vizitator;

public class SalonProxy implements ISpital {

    private Vizitator vizitator;

    public SalonProxy(Vizitator vizitator) {
        this.vizitator = vizitator;
    }

    @Override
    public void echipareVizitator() {

        if (vizitator.getSalaAsteptare().getNrVizitatori() >= 3) {
            vizitator.echipareVizitator();
        } else {
            System.out.println("Nu sunt suficienti vizitatori pentru acces.");
        }
    }
}
