package ro.ase.cts.Supermarket;

public interface Notificare {
    
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
    void trimiteNotificare(String mesaj);
    
}