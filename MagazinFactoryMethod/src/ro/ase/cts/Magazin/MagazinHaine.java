package ro.ase.cts.Magazin;

public class MagazinHaine extends Magazin {

    public MagazinHaine(String nume, int suprafata) {
        super(nume, suprafata);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Magazin haine: " + nume + " | Suprafata: " + suprafata + " mp");
    }
}
