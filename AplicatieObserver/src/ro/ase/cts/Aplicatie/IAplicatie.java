package ro.ase.cts.Aplicatie;

public interface IAplicatie {
    
    void arataNotificare(Observer observer);
    void stergeNotificare(Observer observer);
    void trimiteNotificare(String mesaj);
    
}