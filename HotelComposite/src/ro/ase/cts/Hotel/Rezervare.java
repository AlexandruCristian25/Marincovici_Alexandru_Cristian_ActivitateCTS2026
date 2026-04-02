package ro.ase.cts.Hotel;

public interface Rezervare {
    
    void stergeRezervare(Rezervare rezervare) throws Exception;
    void adaugaRezervare(Rezervare rezervare) throws Exception;
    Rezervare getRezervare(int index) throws Exception;
    void info();
    
}