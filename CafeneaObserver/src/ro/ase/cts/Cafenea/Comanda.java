package ro.ase.cts.Cafenea;

public interface Comanda {
    
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
    void trimiteNotificare(String mesaj);
    
}