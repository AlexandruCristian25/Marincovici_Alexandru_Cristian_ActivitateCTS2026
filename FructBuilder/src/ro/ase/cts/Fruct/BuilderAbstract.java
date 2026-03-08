package ro.ase.cts.Fruct;

public interface BuilderAbstract {
    
    BuilderAbstract setNumeFruct(String numeFruct);
    BuilderAbstract setGreutate(double greutate);
    BuilderAbstract setCuloare(String culoare);
    FructBuilder build();
    
}