package ro.ase.cts.Loc;

public class Liber implements State {

    @Override
    public void rezervareLoc(Loc loc) {
        System.out.println("Locul a fost rezervat");
        loc.setStare(new Rezervat());
    }

    @Override
    public void ocupaLoc(Loc loc) {
        System.out.println("Locul a fost ocupat direct");
        loc.setStare(new Ocupat());
    }

    @Override
    public void eliberareLoc(Loc loc) {
        System.out.println("Locul este deja liber");
    }
    
}