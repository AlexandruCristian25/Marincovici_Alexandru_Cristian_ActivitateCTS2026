package ro.ase.cts.Masina;

public class MasinaOras extends Masina {

    public MasinaOras(String model, int putere) {
        super(model, putere);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Masina de oras: " + model + " | Putere: " + putere);
    }
}