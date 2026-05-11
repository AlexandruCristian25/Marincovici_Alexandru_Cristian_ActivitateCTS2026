package ro.ase.cts.Carte;

public class Carte implements ICarte {

    private int codCarte;
    private int pret;

    public Carte(int codCarte, int pret) {

        super();
        this.codCarte = codCarte;
        this.pret = pret;

    }

    @Override
    public void info(Cumpara cumpara) {

        System.out.println(this.toString() + " " + cumpara.toString());

    }

    @Override
    public String toString() {

        return "Carte [codCarte=" + codCarte + ", pret=" + pret + "]";

    }

}