package ro.ase.cts.Stadion;

public class OcupareLoc extends IntrareStadion {

    public OcupareLoc(int nrLoc) {

        super(nrLoc);

    }

    @Override
    public void asezareCoada(int nrLoc) {

        System.out.println("Asezare la coada pentru locul " + nrLoc);

    }

    @Override
    public void prezentareBilet(int nrLoc) {

        System.out.println("Pentru locul " + nrLoc + " a fost prezentat biletul");

    }

    @Override
    public void controlCorporal(int nrLoc) {

        System.out.println("Inainte de a se ocupa locul " + nrLoc + " spectatorul este verificat");

    }

    @Override
    public void ocupareLoc(int nrLoc) {

        System.out.println("Locul " + nrLoc + " a fost ocupat");

    }

}