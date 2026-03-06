package ro.ase.cts.Masina;

public class MasinaCurse extends Masina {

    public MasinaCurse(String model, int putere) {
        super(model, putere);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Masina de curse: " + model + " | Putere: " + putere);
    }
}