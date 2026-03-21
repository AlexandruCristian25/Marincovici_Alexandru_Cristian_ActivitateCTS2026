package ro.ase.cts.Concert;

public interface BuilderAbstract {
    
    BuilderAbstract.setLocatie(String locatie);
    BuilderAbstract.setPretBilet(double pretBilet);
    BuilderAbstract.setNrLoc(int nrLoc);
    RezervareLoc build();
    
}