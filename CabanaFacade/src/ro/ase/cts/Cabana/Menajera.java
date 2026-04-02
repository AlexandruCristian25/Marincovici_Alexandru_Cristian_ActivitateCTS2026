package ro.ase.cts.Cabana;

import java.util.ArrayList;
import java.util.List;

public class Menajera {

    private List<Boolean> listaCamere;

    public Menajera() {

        listaCamere = new ArrayList<Boolean>();

        for (int i = 0; i < 8; i++) {
            listaCamere.add(true);
        }

        for (int i = 8; i < 14; i++) {
            listaCamere.add(false);
        }
    }

    public boolean cameraLibera(int nr) {
        return listaCamere.get(nr - 1);
    }

    public boolean esteCurata(int nrCamera) {
        return listaCamere.get(nrCamera - 1);
    }
}
