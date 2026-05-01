package ro.ase.cts.Fabrica;


public interface IFabrica {
    
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
    void trimiteNotificare(String mesaj);
    
}