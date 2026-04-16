package ro.ase.cts.Autobuz;

public interface Optiune {
    
    void adaugaNod(Optiune optiune);
    void stergeNod(Optiune optiune);
    Optiune getNod(int index);
    void afisareInfo();
    
}