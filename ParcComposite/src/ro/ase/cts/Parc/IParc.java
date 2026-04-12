package ro.ase.cts.Parc;

public interface IParc {
    
    void stergeNod(IParc parc) throws Exception;
    void adaugaNod(IParc parc) throws Exception;
    IParc getNod(int index) throws Exception;
    void info();
    
}