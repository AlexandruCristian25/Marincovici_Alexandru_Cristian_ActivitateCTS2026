
package ro.ase.cts.Aeroport;

public interface BuilderAbstract {

    BuilderAbstract setNumePasager(String numePasager);
    BuilderAbstract setPret(double pret);
    BuilderAbstract setNrLoc(int nrLoc);

    Bilet build();
}
