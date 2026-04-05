package ro.ase.cts.Sejur;

public interface ISejur {
    
    void adaugaNotificare(Observer observer);
    void stergeNotificare(Observer observer);
    void trimiteNotificare(String mesaj);
    
}