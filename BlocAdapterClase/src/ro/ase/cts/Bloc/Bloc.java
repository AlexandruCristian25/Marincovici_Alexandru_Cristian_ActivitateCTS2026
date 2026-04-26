package ro.ase.cts.Bloc;

public class Bloc {
    
    private int nrBloc;
    private int nrApartamente;

    public Bloc(int nrBloc, int nrApartamente) {
        this.nrBloc = nrBloc;
        this.nrApartamente = nrApartamente;
    }

    public int getNrBloc() {
        return nrBloc;
    }

    public int getNrApartamente() {
        return nrApartamente;
    }

    @Override
    public String toString() {
        return "Bloc nr. " + nrBloc + " cu " + nrApartamente + " apartamente";
    }
    
}