package ro.ase.cts.Fotbal;

public interface BuilderAbstract {
    
    BuilderAbstract setNumeEchipa(String numeEchipa);
    BuilderAbstract setNrJucatori(int nrJucatori);
    RezervareEchipa build();
    
}