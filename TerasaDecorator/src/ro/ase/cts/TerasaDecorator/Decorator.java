package ro.ase.cts.Terasa;

public abstract class Decorator implements IChitanta {

    protected Chitanta chitanta;

    public Decorator(Chitanta chitanta) {
        this.chitanta = chitanta;
    }

    @Override
    public void printeazaChitanta() {
        chitanta.printeazaChitanta();
        System.out.println("Multumim, va mai asteptam!");
    }
}