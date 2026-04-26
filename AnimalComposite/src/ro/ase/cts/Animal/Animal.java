package ro.ase.cts.Animal;

import java.util.ArrayList;
import java.util.List;

public class Animal implements Specie {

    private final List<Specie> lista;
    private final String nume;

    public Animal(String nume) {
        this.lista = new ArrayList<>();
        this.nume = nume;
    }

    @Override
    public void adaugaNod(Specie specie) {
        lista.add(specie);
    }

    @Override
    public void stergeNod(Specie specie) {
        lista.remove(specie);
    }

    @Override
    public Specie getNod(Specie specie) {
        int index = lista.indexOf(specie);
        if (index == -1) {
            return null;
        }
        return lista.get(index);
    }

    @Override
    public void detalii() {
        System.out.println("Specie " + nume);
        for (Specie specie : lista) {
            specie.detalii();
        }
    }
}
