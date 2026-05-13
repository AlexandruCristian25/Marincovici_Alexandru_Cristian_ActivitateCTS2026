package ro.ase.cts.Main;

import ro.ase.cts.Cinema.CautareFilm;
import ro.ase.cts.Cinema.CautareSala;
import ro.ase.cts.Cinema.Cinema;

public class Main {
    public static void main(String[] args) {

        Cinema cautareFilm = new CautareFilm("Cinema1");
        cautareFilm.vindeBilet();

        CautareSala cautareSala = new CautareSala("Cinema1");
        cautareSala.vindeBilet();

    }
}
