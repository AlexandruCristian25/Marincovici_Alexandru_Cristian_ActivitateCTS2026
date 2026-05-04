package ro.ase.cts.FastFood;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private List<Boolean> listaMese;

    public Client() {

        listaMese = new ArrayList<Boolean>();

        for (int i = 0; i < 10; i++) {
            listaMese.add(true);
        }

        for (int i = 10; i < 15; i++) {
            listaMese.add(false);
        }
    }

    public boolean esteMasaCurata(int nr) {
        return listaMese.get(nr - 1);
    }

    public boolean esteMasaLibera(int nrMasa) {
        return listaMese.get(nrMasa - 1);
    }
}
