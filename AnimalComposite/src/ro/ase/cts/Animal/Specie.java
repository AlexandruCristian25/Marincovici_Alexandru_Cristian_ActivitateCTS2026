package ro.ase.cts.Animal;

public interface Specie {
    
    void adaugaNod(Specie specie) throws Exception;
    void stergeNod(Specie specie) throws Exception;
    Specie getNod(Specie specie) throws Exception;
    void detalii();
    
}