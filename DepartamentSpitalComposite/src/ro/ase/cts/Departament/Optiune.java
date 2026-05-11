package ro.ase.cts.Departament;

public interface Optiune {
    
    void adaugaNod(Optiune optiune);
    void stergeNod(Optiune optiune);
    Optiune getNod(int index);
    void afiseaza(String indentare);
    
}