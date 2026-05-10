package ro.ase.cts.Cafenea;

public abstract class Decorator implements ICafea {
    protected Cafea cafea;

    public Decorator(Cafea cafea) {
        this.cafea = cafea;
    }

    @Override
    public void vindeCafea() {
        cafea.vindeCafea();
        System.out.println("Se adauga lapte");
    }
}
