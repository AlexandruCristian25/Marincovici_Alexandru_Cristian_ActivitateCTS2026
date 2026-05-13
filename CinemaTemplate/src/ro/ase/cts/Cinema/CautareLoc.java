package ro.ase.cts.Cinema;

public class CautareLoc extends Cinema {

    public CautareLoc(String nume) {
        super(nume);
    }

    @Override
    public void cautareFilm(String nume) {
        System.out.println("Cautare film in " + nume);
    }

    @Override
    public void cautareSala(String nume) {
        System.out.println("Cautare sala din " + nume);
    }

    @Override
    public void cautareLoc(String nume) {
        System.out.println("Cautare loc pentru filmul din " + nume);
    }
}
