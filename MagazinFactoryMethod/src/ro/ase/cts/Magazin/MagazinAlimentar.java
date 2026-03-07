package ro.ase.cts.Magazin;

public class MagazinAlimentar extends Magazin {

    public MagazinAlimentar(String nume, int suprafata) {
        super(nume, suprafata);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Magazin alimentar: " + nume + " | Suprafata: " + suprafata + " mp");
    }
}
