package ro.ase.cts.BonCasa;

import java.util.ArrayList;
import java.util.List;

public class BonCasa implements Cloneable {

    private String denumireFarmacie;
    private List<String> produse;
    private double total;

    public BonCasa(String denumireFarmacie) {
        this.denumireFarmacie = denumireFarmacie;
        this.produse = new ArrayList<>();
        this.total = 0;
    }

    public void adaugaProdus(String produs, double pret) {
        this.produse.add(produs);
        this.total += pret;
    }

    @Override
    public BonCasa clone() {
        try {
            BonCasa copie = (BonCasa) super.clone();
            copie.produse = new ArrayList<>(this.produse);
            return copie;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clonare esuata");
        }
    }

    @Override
    public String toString() {
        return "BonCasa{" +
                "denumireFarmacie='" + denumireFarmacie + '\'' +
                ", produse=" + produse +
                ", total=" + total +
                '}';
    }
}
