package ro.ase.cts.Produs;

public interface Optiune {

    void adaugaNod(Optiune optiune);
    void stergeNod(Optiune optiune);
    Optiune getNod(int index);
    void info();

}