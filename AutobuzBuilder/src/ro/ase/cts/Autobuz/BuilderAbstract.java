package ro.ase.cts.Autobuz;


public interface BuilderAbstract {
    
    BuilderAbstract.setLinie(int linie);
    BuilderAbstract.setStatie(String statie);
    AutobuzLinie build();
    
}