package ro.ase.cts.Medicament;

public interface Sectiune {
    
    void adaugareMedicament(Sectiune sectiune);
    void stergeMedicament(Sectiune sectiune);
    Sectiune getMedicament(int index);
    void info();
    
}