package ro.ase.cts.Bilet;

public class Bilet {
    private String persoana;
    private IBilet bilet;

    public Bilet(String persoana, IBilet bilet) {
        this.persoana = persoana;
        this.bilet = bilet;
    }

    public Bilet(String persoana) {
        this.persoana = persoana;
    }

    public String getPersoana() {
        return persoana;
    }

    public void setPersoana(String persoana) {
        this.persoana = persoana;
    }

    public IBilet getIBilet() {
        return bilet;
    }

    public void setIBilet(IBilet bilet) {
        this.bilet = bilet;
    }

    public void rezervare(int nrLoc) {
        if (bilet == null) {
            throw new IllegalStateException("Tipul de bilet nu a fost setat.");
        }
        bilet.rezervare(persoana, nrLoc);
    }
}
