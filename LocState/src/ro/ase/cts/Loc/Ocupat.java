package ro.ase.cts.Loc;

public class Ocupat implements State {

    @Override
    public void rezervareLoc(Loc loc) {
        System.out.println("Locul este ocupat, nu poate fi rezervat");
    }

    @Override
    public void ocupaLoc(Loc loc) {
        System.out.println("Locul este deja ocupat");
    }

    @Override
    public void eliberareLoc(Loc loc) {
        System.out.println("Locul a fost eliberat");
        loc.setStare(new Liber());
    }
    
}