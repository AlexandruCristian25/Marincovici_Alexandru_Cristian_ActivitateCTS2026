package ro.ase.cts.Masina;

public class MasinaMarfa extends Masina {

    public MasinaMarfa(String model, int putere) {
        super(model, putere);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Masina de marfa: " + model + " | Putere: " + putere);
    }
}