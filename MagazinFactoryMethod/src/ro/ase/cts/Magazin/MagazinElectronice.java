package ro.ase.cts.Magazin;

public class MagazinElectronice extends Magazin {

    public MagazinElectronice(String nume, int suprafata) {
        super(nume, suprafata);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Magazin electronice: " + nume + " | Suprafata: " + suprafata + " mp");
    }
}
