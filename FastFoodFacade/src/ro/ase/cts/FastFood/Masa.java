package ro.ase.cts.FastFood;

import java.util.ArrayList;
import java.util.List;

public class Masa {

    private List<Integer> listaMese;

    public Masa() {

        listaMese = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            listaMese.add(i + 1);
        }
    }

    public boolean verificaMasaLibera(int nrMasa) {
        return listaMese.contains(nrMasa);
    }
}
