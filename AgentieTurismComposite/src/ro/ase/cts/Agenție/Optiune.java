package ro.ase.cts.Agentie;

public interface Optiune {
    
    void StergeNod(Optiune optiune) throws Exception;
    void AdaugaNod(Optiune opriune) throws Exception;
    Optiune getNod(int index) throws Exception;
    void descriere();
    
}