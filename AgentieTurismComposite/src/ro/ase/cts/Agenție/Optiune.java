package ro.ase.cts.Agentie;

public interface Optiune {
    
    void stergeNod(Optiune optiune) throws Exception;
    void adaugaNod(Optiune opriune) throws Exception;
    Optiune getNod(int index) throws Exception;
    void descriere();
    
}