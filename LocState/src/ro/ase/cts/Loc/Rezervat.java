package ro.ase.cts.Loc;

public class Rezervat implements State {

    @Override
    public void rezervareLoc(Loc loc) {
        System.out.println("Locul este deja rezervat");
    }

    @Override
    public void ocupaLoc(Loc loc) {
        System.out.println("Locul rezervat a fost ocupat");
        loc.setStare(new Ocupat());
    }

    @Override
    public void eliberareLoc(Loc loc) {
        System.out.println("Rezervarea a fost anulata");
        loc.setStare(new Liber());
    }
    
}