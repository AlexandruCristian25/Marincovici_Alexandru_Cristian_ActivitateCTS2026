package ro.ase.cts.Bloc;

public class Adresa extends Bloc implements IBloc {

    public Adresa(int nrBloc, int nrApartamente) {
        super(nrBloc, nrApartamente);
    }

    @Override
    public void detalii() {
        System.out.println("Blocul are numarul " + getNrBloc() +
                " si " + getNrApartamente() + " apartamente.");
    }
    
}