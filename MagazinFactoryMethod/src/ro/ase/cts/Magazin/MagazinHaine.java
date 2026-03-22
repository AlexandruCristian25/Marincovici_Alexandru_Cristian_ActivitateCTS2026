package ro.ase.cts.Magazin;

public class MagazinHaine extends Magazin {

    public MagazinHaine(String nume, int suprafata) {

        super(nume, suprafata);

    }

    @Override
    public void afiseazaDetalii() {

        StringBuilder sb = new StringBuilder();
        sb.append("Nume : ").append(nume);
        sb.append("Suprafata: ").append(suprafata);

        System.out.println(sb.toString());

    }
}
