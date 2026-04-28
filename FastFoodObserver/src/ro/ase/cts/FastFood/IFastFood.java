package ro.ase.cts.FastFood;

public interface IFastFood {

    void adaugaObserver(Observer observer);
    void stergereObserver(Observer observer);
    void trimiteNotificare(String mesaj);
    
}