package ro.ase.cts.Teatru;

import java.util.ArrayList;
import java.util.List;

public class Teatru implements Prototype2 {

    private String denumire;
    private List<String> spectacole;

    public Teatru(String denumire) {
        this.denumire = denumire;
        this.spectacole = new ArrayList<>();
    }

    public void adaugaSpectacol(String spectacol) {
        this.spectacole.add(spectacol);
    }

    @Override
    public Prototype2 clone() {
        Teatru copie = new Teatru(this.denumire);
        copie.spectacole = new ArrayList<>(this.spectacole);
        return copie;
    }

    @Override
    public String toString() {
        return "Teatru{" +
                "denumire='" + denumire + '\'' +
                ", spectacole=" + spectacole +
                '}';
    }
}
