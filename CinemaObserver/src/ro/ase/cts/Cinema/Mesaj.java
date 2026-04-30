package ro.ase.cts.Cinema;

public interface Mesaj {
    
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
    void trimiteMesaj(String mesaj);
    
}